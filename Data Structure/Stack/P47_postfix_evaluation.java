import java.util.*;
import java.lang.*;

//postfix evaluation
public class P47_postfix_evaluation {
	static int top = -1;
	static int arr[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a postfix string : ");
		String postfix = sc.nextLine();
		int value = 0;
		int i = 0;
		int op1 = 0;
		int op2 = 0;
		int d = 0;

		// finding the lendth of the postfix
		int length = postfix.length();
		arr = new int[length];

		char ch = postfix.charAt(i);

		for (i = 0; i < length; i++) {
			ch = postfix.charAt(i);
			// che
			//ck that coming character is digit or not
			if (Character.isDigit(ch)) {
				// converting character into digit and pushing into stack
				push(ch - '0');
			} else {
				// pop out two digits if coming character is operator
				op2 = pop();
				op1 = pop();
				value = perform_operation(op1, op2, ch);
				push(value);
			}
		}
		int v = pop();
		System.out.println("value:" + v);
	}

	// methods for stack handling
	public static void push(int ch) {
		top = top + 1;
		arr[top] = ch;
	}

	public static int pop() {
		if (top == -1) {
			System.out.println("stake underflow:");
			return -1;
		} else {
			top = top - 1;
			return arr[top + 1];
		}
	}

	public static int perform_operation(int op1, int op2, char ch) {
		int n = 0;
		switch (ch) {
			case '+':
				n = op1 + op2;
				return n;
			case '-':
				n = op1 - op2;
				return n;
			case '*':
				n = op1 * op2;
				return n;
			case '/':
				n = op1 / op2;
				return n;
			case '^':
				n = 1;
				for (int i = 0; i < op2; i++) {
					n = n * op1;
				}
				return n;
			default:
				return 0;
		}
	}

	// public static int peek(){
	// return arr[top];
	// }
	public static void display() {
		System.out.println("top" + top);
		for (int i = 0; i <= top; i++) {
			System.out.println("a[" + i + "]" + arr[i]);
		}
	}
}