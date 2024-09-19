import java.util.*;

public class Implement_Func_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("enter element a[" + i + "]");
			a[i] = sc.nextInt();
		}
		int ans = sum(a, n);
		System.out.println("sum is:" + ans);
		int ans2 = min(a, n);
		System.out.println("min is:" + ans2);
		int ans3 = max(a, n);
		System.out.println("max is:" + ans3);
		double ans4 = avg(a, n);
		System.out.println("avrage is:" + ans4);
	}

	public static int sum(int[] a, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static int min(int[] a, int n) {
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static int max(int[] a, int n) {
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static double avg(int[] a, int n) {
		int a1 = sum(a, n);
		double avg = a1 / n;
		return avg;
	}
}