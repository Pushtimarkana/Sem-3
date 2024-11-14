/*
	*Convert infix to prefix String
*/
import java.util.*;
public class Prefix_46{
	static int top=-1;
	static char stack[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str="(a+b)*c+d/(b+a*c)+d";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			char c=str.charAt(i);
			if(c==')'){
				rev=rev+'(';
			}
			else if(c=='('){
				rev=rev+')';
			}else{
				rev=rev+c;
			}
		}

		//// input string includes one extra ')' bracket and one space at the end of String:
		rev=rev+") ";
		System.out.println("reverce str:"+rev);
		stack = new char[rev.length()];

		//push '(' in stack
		push('(');
		String polish="";
		int rank=0;
		int i=0;
		char ch=rev.charAt(i);
		while(ch!=' '){
			if(stack[0]=='\0'){
                System.out.println("INVALID 1");
                return;
            }
            while(stack_precedence(peek())>input_precedence(ch)){
                char temp=pop();
                polish = polish+""+temp;
                rank=rank+rank(temp);
                if(rank<1){
                    System.out.println("INVALID 2");
                    return;
                }
            }
            if(stack_precedence(peek())!=input_precedence(ch)){
                push(ch);
            }
            else{
                pop();
            }
            i++;
            ch=rev.charAt(i);
		}
		System.out.println("rank="+rank);
		if(top!=-1|| rank!=1){
            System.out.println("INVALID 3");
            //System.out.println(polish);
        }
        else{
            System.out.println("VALID");
            //System.out.println(polish);
            String rev_polish="";
				for(int j=polish.length()-1;j>=0;j--){
					char c=polish.charAt(j);
					rev_polish=rev_polish+c;
				}
			System.out.println(rev_polish);
        }
	}

	//create push method for stack it is push an element in stack
	//return type:void
	public static void push(char x){
		if(top>=stack.length){
            System.out.println("Stack overflow");
        }else{
			top=top+1;
			stack[top]=x;
		}
	}

	//create pop method for stack it is return and delete top element of stack
	//return type:char
	public static char pop(){
		if(top<=-1){
            System.out.println("Stack underflow");
            return 'N';
        }else{
			top=top-1;
			return stack[top+1];
		}
	}
	//create peek method for stack it is only return top element of stack
	//return type:char
	public static char peek(){
		if(top<=-1){
            System.out.println("Stack underflow");
            return 'N';
        }else{
			return stack[top];
		}
	}

	public static void display(){
		System.out.println("top"+top);
		for(int i=0;i<=top;i++){
			System.out.println("a["+i+"]"+stack[i]);
		}
	}
	//create method input precedence of character
	public static int input_precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 2;
        } 
        else if(ch == '*' || ch == '/'){
            return 4;
        }
        else if(ch == '^'){
            return 5;
        }
        else if(ch=='('){
            return 9;
        }
        else if(ch==')'){
            return 0;
        }
        else {
           return 7;
        }
     }
     //create method for stack precedence of charcter
    public static int stack_precedence(char top) {
        if (top == '+' || top == '-') {
            return 1;
        } 
        else if(top == '*' || top == '/'){
            return 3;
        }
        else if(top == '^'){
            return 6;
        }
        else if(top=='('){
            return 0;
        }
        // else if(ch==')'){
        //     return 0;
        // }
        else {
           return 8;
        }
    }

    //create rank method for count rank of polish notation 
    public static int rank(char temp){
    	    if(temp=='+'||temp=='-'||temp=='*'||temp=='/'||temp=='^'||temp=='('||temp==')'){
            return -1;
        }else{
            return 1;
        }
    }
}
