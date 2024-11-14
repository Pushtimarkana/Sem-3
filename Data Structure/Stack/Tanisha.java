import java.util.*;
public class Tanisha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String str=sc.nextLine();

        Stack<Character> stack=new Stack<>();
        int i=0;
        char ch=str.charAt(i);
          
        while(ch != 'c'){
            if(ch==' '){
                System.out.println("invalid string 1:");
                break;
            }
            else{
                stack.push(ch);
            }
            i++;
        }
        i++;

        while(!stack.isEmpty()){
            char temp1=stack.pop();
            if(ch!=temp1){
                System.out.println("invalid string:");
                break;
            }
            i++;
        }
        
        if(ch==' '){
            System.out.println("Valid string");
        }
        else{
            System.out.println("invalid string 3:");
        }
    
     }
}