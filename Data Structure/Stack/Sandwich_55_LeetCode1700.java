import java.util.*;
// class Stack {
//     int top = -1;
//     int s_arr[];

//     public Stack(int s_arr[]) {
//         this.s_arr = s_arr;
//     }

//     public void push(int x) {
//         if (top >= s_arr.length) {
//             System.out.println("Stack overflow");
//         } else {
//             top = top + 1;
//             s_arr[top] = x;
//         }
//     }

//     public int pop() {
//         if (top <= -1) {
//             System.out.println("Stack underflow");
//             return 'N';
//         } else {
//             top = top - 1;
//             return s_arr[top + 1];

//         }
//     }

//     public int peek() {
//         if (top <= -1) {
//             System.out.println("Stack underflow");
//             return 'N';
//         } else {
//             // top = top - 1;
//             return s_arr[top];

//         }
//     }
// }

// class Queue {
//     int r = -1;
//     int f = -1;
//     int cq_arr[];

//     public Queue(int cq_arr[]) {
//         this.cq_arr = cq_arr;
//     }

//     public void cq_enqueue(int data) {
//         if ((r + 1) % cq_arr.length == f) {
//             System.out.println("Queue Overflow:");
//             return;
//         }
//         r = (r + 1) % cq_arr.length;
//         cq_arr[r] = data;
//         if (f == -1) {
//             f = 0;
//             return;
//         }
//     }

//     public int cq_dequeue() {
//         if (f == -1) {
//             System.out.println("Queue Underflow:");
//             return -1;
//         }
//         int y = cq_arr[f];
//         if (f == r) {
//             f = r = -1;
//         } else {
//             f = (f + 1) % cq_arr.length;
//         }
//         return y;
//     }

//     public int peek() {
//         if (f <= -1) {
//             System.out.println("Queue underflow");
//             return 'N';
//         } else {
//             // top = top - 1;
//             return cq_arr[f];

//         }
//     }
// }

public class Sandwich_55_LeetCode1700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students and sandwich:");
        int n = sc.nextInt();

        Stack<Integer> sandwich = new Stack<>();
        // int s_arr[] = new int[n];
        // int cq_arr[] = new int[n];
        // Stack s1 = new Stack(s_arr);
        // Queue q1 = new Queue(cq_arr);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student type:");
            int s = sc.nextInt();
            sandwich.push(s);
        }
        while (!sandwich.isEmpty()) {
            System.out.println("stack:" + sandwich.pop());
        }
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter sandwich type:");
        // cq_arr[i] = sc.nextInt();
        // q1.cq_enqueue(cq_arr[i]);
        // }
        // boolean flag = true;

        // int count = 0;
        // while (flag) {
        // if (s1.peek() == q1.peek()) {
        // s1.pop();
        // q1.cq_dequeue();
        // count++;
        // } else {
        // int q = q1.cq_dequeue();
        // q1.cq_enqueue(q);
        // }
        // if (count == n) {
        // System.out.println("No of student who don't eat sandwich is 0");
        // flag = false;
        // }
        // }
        // System.out.println("no of student:" + (n - count));

    }
}
