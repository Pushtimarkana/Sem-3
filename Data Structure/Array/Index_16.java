import java.util.*;
public class Index_16 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element a["+i+"]");
            a[i]=sc.nextInt();
        }
        int minI=0,maxI=0;
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
                minI=i;
            }
            if(a[i]>max){
                max=a[i];
                maxI=i;
            }
        }
        System.out.println("min position:"+ minI);
        System.out.println("MAX position:"+ maxI);
    }
}