import java.util.LinkedList;
import java.util.Queue;

public class LAB55 {

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students) {
            studentQueue.offer(student);
        }
        
        int count = 0; // To track how many times the sandwich has been rejected
        
        int sandwichIndex = 0; // Index to track the sandwich stack
        while (!studentQueue.isEmpty()) {
            if (studentQueue.peek() == sandwiches[sandwichIndex]) {
                // Student at the front takes the sandwich
                studentQueue.poll();
                sandwichIndex++;
                count = 0; // Reset the rejection count
            } else {
                // Student rejects the sandwich, goes to the back of the queue
                studentQueue.offer(studentQueue.poll());
                count++;
            }
            
            // If all students reject the current sandwich, break
            if (count == studentQueue.size()) {
                break;
            }
        }
        
        // The number of students left in the queue are the ones unable to eat
        return studentQueue.size();
    }

    public static void main(String[] args) {
        // Example 1
        int[] students1 = {1, 1, 0, 0};
        int[] sandwiches1 = {0, 1, 0, 1};
        System.out.println("example 1");
        System.out.println(countStudents(students1, sandwiches1)); // Output: 0
        
        // Example 2
        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println("example 2");
        System.out.println(countStudents(students2, sandwiches2)); // Output: 3
    }
}
