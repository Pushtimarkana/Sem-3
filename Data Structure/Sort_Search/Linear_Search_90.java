import java.util.*;

public class Linear_Search_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element of arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter what you want to search:");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("element is found at:" + i + "");
                flag++;
                return;
            }
        }
        if (flag == 0) {
            System.out.println("element is not found:");
        }
    }
}