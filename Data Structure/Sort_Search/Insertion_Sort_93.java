import java.util.*;

class Sort {
    public void insertion_Sort(int[] arr, int n) {
        int i = 1;
        while (i < n) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            i = i + 1;
        }
        // print sorted array
        for (i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}

public class Insertion_Sort_93 {
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
        s1.insertion_Sort(arr, n);
    }
}
