
import java.util.*;

class Operation{
    int top=-1;
    int arr[]=new int[5];
    public void push(int x){
        if(top>=4){
            System.out.println("Stack overflow");
        }
        else{
            top=top+1;
            arr[top]=x;
        }
    }

    public int pop(){
        if(top<=-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            top=top-1;
           return arr[top+1];

        }
    }

    public void display(){
        if(top<=-1){
            System.out.println("Stack underflow");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println("arr["+i+"]: "+arr[i]);
            }
        }
    }

    public int peep(int i){
        if((top-i+1) <= -1){
            System.out.println("element "+i+"th not available");
            return -1;
        }
        else{
            return arr[top-i+1];
        }
    }
    public void change(int i,int x){
        if((top-i+1) <= -1){
            System.out.println("element "+i+"th is not available ");
        }
        else{
           arr[top-i+1]=x;
        }
    }

}

public class Stack_Function_38 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Operation op=new Operation();
        int temp=0;
        do{
            System.out.println("Enter 1 for push, 2 for pop, 3 for display , 4 for peep, 5 for change and 6 for exit:");
                temp=sc.nextInt();
            //case:1;
            if(temp==1){
                System.out.println("how many element you push?");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("enter number which you want to push it:");
                    int a=sc.nextInt();
                    op.push(a);
                }
            }
            //case:2
            if(temp==2){
                System.out.println("how many element you pop?");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                   int ans=op.pop();
                   System.out.println("pop:"+ans);
                }
            }
            //case:3
            if(temp==3){
                op.display();
            }
            //case:4
            if(temp==4){
                System.out.println("how many element you peep?");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("enter index from top:");
                    int a=sc.nextInt();
                    int ans=op.peep(a);
                    System.out.println("peep:"+ans);
                }
            }
            //case:5
            if(temp==5){
                System.out.println("how many element you change?");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("enter index from top and number for change:");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    op.change(a,b);
                }
            }
        }while(temp!=6);
    }
}