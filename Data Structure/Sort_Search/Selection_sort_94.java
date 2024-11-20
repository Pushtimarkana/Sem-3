import java.util.*;

class Sort {
    public void selection_Sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int swep = arr[i];
                arr[i] = arr[min];
                arr[min] = swep;
            }
        }
        //print sorted array
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}

public class Selection_sort_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        Sort s = new Sort();
        s.selection_Sort(arr, n);
    }
}