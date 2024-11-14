import java.util.*;
public class String_Recognize_39{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// if you enter string then keep 1 space at last:
		System.out.println("enter a string in form of a,b,c:");
		String str=sc.nextLine();
		Stack<Character> stack=new Stack<>();
		int i=0;
		stack.push('c');
		char ch=str.charAt(0);
		while(ch!='c'){
			if(ch==' '){
				System.out.println("Invalid String");
				break;
			}
			else{
				stack.push(ch);
				i++;
				ch=str.charAt(i);
			}
		}
		i++;
		while(ch!=' '){
				char temp1=stack.pop();
				//System.out.println("temp1:"+temp1);
				char temp2=str.charAt(i);
				//System.out.println("temp2:"+temp2);
				if(temp1!=temp2){
	                System.out.println("invalid string :");
	                break;
	            }
	            i++;
	            ch=str.charAt(i);
		}
		ch=str.charAt(i);
		if(ch==' '){
            System.out.println("valid string :");
        }
        else{
            System.out.println("invalid string :");
        }

	}
}