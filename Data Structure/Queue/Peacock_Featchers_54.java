import java.util.*;

public class Peacock_Featchers_54 {
    static int f = -1;
    static int r = -1;
    static String queue[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        queue = new String[n];
        enQueue("red");
        enQueue("blue");
        enQueue("green");
        // enQueue(40);
        // enQueue(50);
        String q = deQueue();
        // System.out.println(q);
        enQueue(q);
        q = deQueue();
        // System.out.println(q);
        enQueue(q);
        enQueue("Yellow");
        q = deQueue();
        enQueue(q);
        q = deQueue();
        enQueue(q);
        q = deQueue();
        enQueue(q);
        q = deQueue();
        enQueue(q);
        enQueue("pink");
        display();
    }

    public static void enQueue(String data) {
        if (r >= queue.length - 1) {
            System.out.println("Queue Overflow:");
            return;
        }
        r = r + 1;
        queue[r] = data;
        if (f == -1) {
            f = 0;
            return;
        }
    }

    public static String deQueue() {
        if (f == -1) {
            System.out.println("Queue Underflow:");
            return "nott";
        }
        String y = queue[f];
        if (f == r) {
            f = r = -1;
        } else {
            f = f + 1;
        }
        return y;
    }

    public static void display() {
        for (int i = f; i <= r; i++) {
            System.out.println("Queue[" + i + "]:" + queue[i]);
        }
    }
}