import java.util.*;

class Sort {
    int arr[];

    public Sort(int arr[]) {
        this.arr = arr;
    }

    public void shell_Sort(int n) {

        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    System.out.println("i-gap" + (i - gap));
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int swep = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = swep;
                    }
                }
            }
        }
    }

    public void display(int n) {
        for (int k = 0; k < n; k++) {
            System.out.println("arr[" + k + "]:" + arr[k]);
        }
    }
}

public class Shell_Sort_99 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        Sort s1 = new Sort(arr);
        s1.shell_Sort(n);
        s1.display(n);
    }
}
