import java.util.*;
public class Sum_14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int m=sc.nextInt();
    System.out.println("enter number:");
    int n=sc.nextInt();
    int sum=0;
    for(int i=m;i<=n;i++){
        sum=sum+i;
    }
    System.out.println("sum is:"+sum);
    }
}