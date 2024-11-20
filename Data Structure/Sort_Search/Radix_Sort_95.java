import java.util.*;

class Sort {
    public void radix_Sort(int arr[], int n) {
        int max = getMax(arr, n);
        int place = 0;
        for (place = 1; max / place > 0; place *= 10) {
            count_Sort(arr, n, place);
        }

        for (int k = 0; k < n; k++) {
            System.out.println("arr[" + k + "]:" + arr[k]);
        }
    }

    public void count_Sort(int arr[], int n, int place) {
        int c[] = new int[10];
        int b[] = new int[n];

        for (int i = 0; i < 10; i++) {
            c[i] = 0;
        }
        for (int j = 0; j < n; j++) {
            c[(arr[j] / place) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            c[(arr[j] / place) % 10]--;
            b[c[(arr[j] / place) % 10]] = arr[j];

        }
        for (int k = 0; k < n; k++) {
            arr[k] = b[k];
        }
    }

    public int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Radix_Sort_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element:");
            arr[i] = sc.nextInt();
        }

        Sort s = new Sort();

        s.radix_Sort(arr, n);
    }
}
