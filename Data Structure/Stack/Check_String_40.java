import java.util.*;
public class Check_String_40{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// if you enter string then keep 1 space at last:
		System.out.println("enter a string of the form a^(i)*b^(i):");
		String str=sc.nextLine();
		Stack<Character> stack_a=new Stack<>();
		Stack<Character> stack_b=new Stack<>();
		int i=0;
		char c=str.charAt(0);
		while(c!=' '){
			if(c=='a'){
				stack_a.push(c);
				i++;
			}
			else if(c=='b'){
				stack_b.push(c);
				i++;
			} 
			c=str.charAt(i);
		}
		int a=0,b=0;
		while(!stack_a.isEmpty() || !stack_b.isEmpty()){
			if(!stack_a.isEmpty()){
				stack_a.pop();
				a++;
			}
			else if(!stack_b.isEmpty()){
				stack_b.pop();
				b++;
			}
		}
		if(a==b){
			System.out.println("valid string:");
		}
		else{
			System.out.println("Invalid string:");
		}
	}
}