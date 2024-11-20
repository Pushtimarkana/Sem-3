import java.util.*;

class Sort {
    float arr[];
    int n;

    public Sort(float[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public void insertionSort(float bukket) {
        int i = 1;
        while (i < n) {
            float key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            i = i + 1;
        }
    }

    public void bucketSort() {
        float b[] = new float[n];

        for (int i = 0; i < n; i++) {
            int index = (int) (Math.floor(n * arr[i]));
            b[index] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            insertionSort(b[i]);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = b[i];
        }
    }

    public void dispaly() {
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }

    }
}

public class Bucket_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        float arr[] = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element:");
            arr[i] = sc.nextFloat();
        }

        Sort s = new Sort(arr, n);

        s.bucketSort();
        s.dispaly();
    }
}
