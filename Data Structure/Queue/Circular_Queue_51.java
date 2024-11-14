import java.util.*;

class Queue_Emplement {
	int f = -1;
	int r = -1;

	// int[] queue;
	// int n;
	public void cq_insert(int[] queue, int data) {
		if (r == queue.length - 1) {
			if (f == 0) {
				System.out.println("Queue Overflow:");
				return;
			}
			r = -1;
		}
		r = r + 1;
		if (r == f) {
			System.out.println("Queue Overflow:");
			return;
		}
		queue[r] = data;
		if (f == -1) {
			f = 0;
			return;
		}
	}

	// second method of cq_enqueue
	public void cq_enqueue(int[] queue, int data) {
		if ((r + 1) % queue.length == f) {
			System.out.println("Queue Overflow:");
			return;
		}
		r = (r + 1) % queue.length;
		queue[r] = data;
		if (f == -1) {
			f = 0;
			return;
		}
	}

	public int cq_delete(int[] queue) {
		if (f == -1) {
			System.out.println("Queue Underflow:");
			return -1;
		}
		int y = queue[f];
		if (f == r) {
			f = r = -1;
		}
		if (f == queue.length - 1) {
			f = 0;
		} else {
			f = f + 1;
		}
		return y;
	}

	// second method of delete
	public int cq_dequeue(int[] queue) {
		if (f == -1) {
			System.out.println("Queue Underflow:");
			return -1;
		}
		int y = queue[f];
		if (f == r) {
			f = r = -1;
		} else {
			f = (f + 1) % queue.length;
		}
		return y;
	}

	public void display(int[] queue) {
		int i = f;
		for (i = f; i != r; i = (i + 1) % queue.length) {
			System.out.println("Queue[" + i + "]:" + queue[i]);
		}
		System.out.println("Queue[" + i + "]:" + queue[i]);
	}
}

public class Circular_Queue_51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 2;
		int queue[] = new int[n];
		Queue_Emplement q1 = new Queue_Emplement();
		// q1.cq_enqueue(queue, 10);
		// q1.cq_enqueue(queue, 20);
		// q1.cq_enqueue(queue, 30);
		// q1.cq_enqueue(queue, 40);
		// q1.cq_enqueue(queue, 50);
		q1.cq_insert(queue, 60);
		q1.cq_insert(queue, 70);
		q1.cq_insert(queue, 80);
		q1.cq_insert(queue, 90);
		// q1.cq_insert(queue,70);
		// q1.display(queue);
		// int ans=q1.cq_delete(queue);
		// System.out.println(ans);
		// int ans2 = q1.cq_dequeue(queue);
		// int ans3 = q1.cq_dequeue(queue);
		// q1.cq_dequeue(queue);
		// q1.cq_dequeue(queue);
		// q1.cq_dequeue(queue);
		// q1.display(queue);
		// q1.cq_enqueue(queue, 60);
		// q1.cq_enqueue(queue,70);
		q1.display(queue);

	}
}