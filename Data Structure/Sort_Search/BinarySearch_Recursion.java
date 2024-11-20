import java.util.*;

class Binary_Search {
    public int binary_Search(int[] arr, int left, int right, int key) {
        int mid = (left + right) / 2;
        while (left <= right) {
            if (key == arr[mid]) {
                // System.out.println("element is found at:" + mid + "");
                // flag++;
                return mid;
            } else if (key < arr[mid]) {
                // right = mid - 1;
                return binary_Search(arr, left, mid - 1, key);
            } else {
                // left = mid + 1;
                return binary_Search(arr, mid + 1, right, key);
            }
        }
        return -1;
    }
}

public class BinarySearch_Recursion {
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

        Binary_Search b1 = new Binary_Search();
        int left = 0, right = n - 1;
        int index = b1.binary_Search(arr, left, right, key);
        if (index == -1) {
            System.out.println("element is not found:");
        } else {
            System.out.println("element is fount at:" + index);
        }

        // for (int i = 0; i < n; i++) {
        // int left = 0, right = n - 1;
        // int mid = (left + right) / 2;
        // if (arr[mid] == key) {
        // System.out.println("element is found at:" + mid + "");
        // flag++;
        // return;
        // } else if (key < arr[mid]) {
        // right = mid - 1;
        // } else {
        // left = mid + 1;
        // }
        // }
        // if (flag == 0) {
        // System.out.println("element is not found:");
        // }
    }
}
