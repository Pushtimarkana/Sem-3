import java.util.*;

class Stack {
    int top = -1;
    char arr[];

    public Stack(char arr[]) {
        this.arr = arr;
    }

    public void push(char x) {
        if (top >= arr.length) {
            System.out.println("Stack overflow");
        } else {
            top = top + 1;
            arr[top] = x;
        }
    }

    public char pop() {
        if (top <= -1) {
            System.out.println("Stack underflow");
            return 'N';
        } else {
            top = top - 1;
            return arr[top + 1];

        }
    }

    public char peek() {
        if (top <= -1) {
            System.out.println("Stack underflow");
            return 'N';
        } else {
            // top = top - 1;
            return arr[top];

        }
    }
}

public class Remove_Star_Leetcode2390 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string with star:");
        String str = sc.nextLine();
        char arr[] = new char[str.length()];
        String new_String = "";

        Stack s = new Stack(arr);
        for (int i = 0; i < arr.length; i++) {
            char c = str.charAt(i);
            s.push(c);
        }
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '*') {
                count++;
                s.pop();
            } else {
                for (int j = 0; j < count; j++) {
                    s.pop();
                    i--;
                }
                count = 0;
                char ch = s.pop();
                new_String = ch + new_String;
            }
        }
        System.out.println(new_String);
    }
}