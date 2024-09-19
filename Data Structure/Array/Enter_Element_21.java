import java.util.*;
public class Enter_Element_21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        System.out.println("enter index betwwen 0 to 4");
        int in=sc.nextInt();
        System.out.println("enter element");
        int e=sc.nextInt();
        int b[]=new int[6];
        for(int i=0;i<6;i++){
            if(i<in){
                b[i]=a[i];
            }
            else if(i==in){
                b[i]=e;
            }
            else if(i>in){
                b[i]=a[i-1];
            }
        }
        for(int i=0;i<6;i++){
        System.out.println("b["+i+"]="+b[i]);
        }
    }
}