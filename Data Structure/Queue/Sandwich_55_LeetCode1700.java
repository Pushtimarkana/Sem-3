import java.util.*;

public class Sandwich_55_LeetCode1700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students and sandwich:");
        int n = sc.nextInt();

        Stack<Integer> sandwich = new Stack<>();
        Deque<Integer> students = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter sandwich type:");
            int s = sc.nextInt();
            sandwich.push(s);
        }
        System.out.println("sandwich:" + sandwich);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student type:");
            int dq = sc.nextInt();
            students.addLast(dq);
        }
        System.out.println("students:" + students);
        boolean flag = true;

        int count = 0;
        int count2 = 0;
        while (flag) {
            if (students.peek() == sandwich.peek()) {
                sandwich.pop();
                students.removeFirst();
                count++;
            } else {
                int q = students.removeFirst();
                students.addLast(q);
                count2++;
            }
            if (count == n) {
                System.out.println("No of student who don't eat sandwich is 0");
                flag = false;
            }
            if (count2 > n) {
                flag = false;
            }

        }
        System.out.println("no of student:" + (n - count));

    }
}
