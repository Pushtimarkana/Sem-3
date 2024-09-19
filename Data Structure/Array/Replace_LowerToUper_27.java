
import java.util.*;

public class Replace_LowerToUper_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		String arr[] = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("enter name arr[" + i + "]:");
			arr[i] = sc.nextLine();
		}
		System.out.println("enter string which is conver to upper or lowercase:");
		String str = sc.nextLine();
		for (int i = 0; i < n; i++) {
			if (arr[i].equals(str)) {
				System.out.println("befor:" + arr[i]);
				String temp = arr[i].toUpperCase();
				System.out.println("after uppercase:" + temp);
				String temp2 = arr[i].toLowerCase();
				System.out.println("after uppercase:" + temp2);
			}
		}
	}
}