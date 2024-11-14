import java.util.*;
public class Swep_Function_33 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter a number");
        int b=sc.nextInt();
        swep_No(a,b);
    }
    public static void swep_No(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("n1="+a);
        System.out.println("n2="+b);
    }
}
