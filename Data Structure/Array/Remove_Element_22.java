import java.util.*;
public class Remove_Element_22 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        System.out.println("enter index betwwen 0 to 4");
        int in=sc.nextInt();
        int b[]=new int[4];
        for(int i=0;i<4;i++){
            if(i<in){
                b[i]=a[i];
            }
            else if(i>=in){
                b[i]=a[i+1];
            }
        }
        for(int i=0;i<4;i++){
            System.out.println("b["+i+"]="+b[i]);
            }
    }
}