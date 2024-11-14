import java.util.*;
class Operation{
	public static void push(char s[],int top,char x){
        if(top>=s.length){
            System.out.println("Stack overflow");
        }
        else{
            //top=top+1;
            s[top]=x; 
        }
    }

    public static char pop(char[] s,int top){
        if(top<=-1){
            System.out.println("Stack underflow");
            return 'N';
        }
        else{
            top=top-1;
           return s[top+1];

        }
    }
}
public class Recognize_String_39{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
        char s[]=new char[str.length()];
        char[] ch1=new char[str.length()];
         ch1=str.toCharArray();
        int top=0;
        s[top]='c';
        top=1;
		Operation o1=new Operation();
        int i=0;
        while(ch1[i]!='c'){
            if(ch1[i]==' '){
                System.out.println("invalid string 1:");
                break;
            }
            else{
                char x=ch1[i];
                o1.push(s,top,x);
                top++;
            }
            i++;
        }
        top--;
        //System.out.println("top:"+top);
        i++;
        while(s[top]!='c'){
            char temp1=ch1[i];
            System.out.println("temp1:"+temp1);
            char temp2=o1.pop(s,top);
            System.out.println("temp2:"+temp2);
            top--;
            if(temp1!=temp2){
                System.out.println("invalid string 2:");
                break;
            }
            i++; 
        }
        if(ch1[i]==' '){
            System.out.println("valid string :");
        }
        else{
            System.out.println("invalid string 3:");
        }
	}
}