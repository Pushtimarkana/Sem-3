import java.util.*;
public class Duplicate_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element a["+i+"]");
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
        }
        if(c==0){
            System.out.println("Does not contains duplicate value");
        }
        else{
            System.out.println(" contains duplicate value");
        }
    }
}