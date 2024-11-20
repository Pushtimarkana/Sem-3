import java.util.*;

class Sort {
    public void count_Sort(int arr[], int max, int n) {
        int c[] = new int[max + 1];
        int b[] = new int[n];

        for (int i = 0; i <= max; i++) {
            c[i] = 0;
        }
        for (int j = 0; j < n; j++) {
            c[arr[j]]++;
        }
        for (int i = 1; i <= max; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            c[arr[j]]--;
            b[c[arr[j]]] = arr[j];

        }
        for (int k = 0; k < n; k++) {
            System.out.println("arr[" + k + "]:" + b[k]);
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

public class Counting_Sort {
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

        int max = s.getMax(arr, n);
        s.count_Sort(arr, max, n);
    }
}