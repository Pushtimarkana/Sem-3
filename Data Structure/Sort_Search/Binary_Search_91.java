import java.util.*;

public class Binary_Search_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // enter sorted array
        for (int i = 0; i < n; i++) {
            System.out.print("enter element of arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter what you want to search:");
        int key = sc.nextInt();
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("element is found at:" + mid + "");
                flag++;
                return;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("element is not found:");
        }
    }
}
