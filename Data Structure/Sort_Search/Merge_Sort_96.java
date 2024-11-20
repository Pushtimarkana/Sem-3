import java.util.*;

class Sort {
    int arr[];

    public Sort(int arr[]) {
        this.arr = arr;
    }

    public void merge_Sort(int low, int high) {
        if (low < high) {
            int mid = ((low + high) / 2);
            merge_Sort(low, mid);
            merge_Sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public void merge(int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int h = low;
        int b[] = new int[high + 1];
        while (h <= mid && j <= high) {
            if (arr[h] < arr[j]) {
                b[i] = arr[h];
                h++;
            } else {
                b[i] = arr[j];
                j++;
            }
            i++;
        }
        if (h > mid) {
            for (int k = j; k <= high; k++) {
                b[i] = arr[k];
                i++;
            }
        } else {
            for (int k = h; k <= mid; k++) {
                b[i] = arr[k];
                i++;
            }
        }
        // copy in our array
        for (int k = low; k <= high; k++) {
            arr[k] = b[k];
            // System.out.println("arr[" + k + "]:" + b[k]);
        }

    }

    public void display(int high) {
        for (int k = 0; k < high + 1; k++) {
            System.out.println("arr[" + k + "]:" + arr[k]);
        }
    }
}

public class Merge_Sort_96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n - 1;
        Sort s1 = new Sort(arr);
        s1.merge_Sort(low, high);
        s1.display(high);
    }
}
