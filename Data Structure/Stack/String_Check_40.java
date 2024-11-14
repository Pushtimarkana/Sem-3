/*
*check string in form of a^x and b^y and x==y then valid string
*/
import java.util.*;
public class String_Check_40{
	static int top;
	static char s1[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// *if you enter string then keep 1 space at last:
		System.out.println("enter a string of the form a^(i)*b^(i):");
		String str=sc.nextLine();
		s1 = new char[str.length()];
		int i=0;
		// *first count number of a 
		char c=str.charAt(i);
			while(c!=' '){
				if(c=='a'){
					push(c);
					i++;
				}
				c=str.charAt(i);
			}
		int a=0,b=0;
			while(s1[0]!='\0'){
					pop();
					a++;
			}
		int i1=0;
		// *then count number of b
		char ch=str.charAt(i);
			while(ch!=' '){
				if(ch=='b'){
					push(ch);
					i1++;
				}
				ch=str.charAt(i1);
			}
			while(s1[0]!='\0'){
				pop();
				b++;
			}
		if(a == b){
			System.out.println("valid string:");
		}
		else{
			System.out.println("Invalid string:");
		}
	}
	public static void push(char x){
        if(top>=s1.length){
            System.out.println("Stack overflow");
        }
        else{
            s1[top]=x;
            top=top+1;
        }
    }
	public static char pop(){
        if(top<=-1){
            System.out.println("Stack underflow");
            return 'N';
        }
        else{
            top=top-1;
           return s1[top+1];

        }
    }
}