import java.util.*;

class Sort {
    int arr[];
    int n;

    public Sort(int arr[], int n) {
        this.arr = arr;
        this.n = n;
    }

    public void quick_Sort(int lb, int ub) {
        boolean flag = true;
        if (lb < ub) {
            int i = lb;
            int j = ub + 1;
            int key = arr[lb];
            while (flag) {
                i = i + 1;
                while (i < n && arr[i] < key) {
                    i = i + 1;
                }
                j = j - 1;
                while (arr[j] > key) {
                    j = j - 1;
                }
                if (i < j) {
                    int swep = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swep;
                } else {
                    flag = false;
                }

            }
            int swep = arr[j];
            arr[j] = arr[lb];
            arr[lb] = swep;
            quick_Sort(lb, j - 1);
            quick_Sort(j + 1, ub);
        }
    }

    public void dispaly() {
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }
}

public class Quick_Sort_97 {
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
        int lb = 0;
        int ub = arr.length - 1;

        s1.quick_Sort(lb, ub);
        s1.dispaly();
    }
}
