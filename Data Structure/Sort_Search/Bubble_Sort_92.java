import java.util.*;

class Sort {
    public void bubble_Sort(int[] arr, int n) {
        int last = n - 1;
        int exchs = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < last; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swep = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swep;
                    exchs++;
                }
            }
            if (exchs == 0) {
                System.out.println("Array is already Sorted:");
                return;
            } else {
                last = last - 1;
            }
        }
        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}

public class Bubble_Sort_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        Sort s1 = new Sort();
        s1.bubble_Sort(arr, n);
    }
}
