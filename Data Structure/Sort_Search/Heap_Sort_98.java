import java.util.*;

class Sort {
    int arr[];
    int n;

    public Sort(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public void heapSort() {
        buildMaxHeap();
        for (int i = n - 1; i >= 0; i--) {
            int swep = arr[0];
            arr[0] = arr[i];
            arr[i] = swep;
            heapify(i, 0);
        }
    }

    public void buildMaxHeap() {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }
    }

    public void heapify(int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndex = i;

        if (left < n && arr[left] > arr[maxIndex]) {
            maxIndex = left;
        }
        if (right < n && arr[right] > arr[maxIndex]) {
            maxIndex = right;
        }
        if (i != maxIndex) {
            int swep = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = swep;
            heapify(n, maxIndex);
        }
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}

public class Heap_Sort_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        Sort s1 = new Sort(arr, n);
        // s1.heapify(1);
        s1.heapSort();
        s1.display();
    }
}