import java.util.*;
public class Postfix_45 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String str="a+b*c/d-c+f/g/(h+i)) ";
       Stack<Character> stack =new Stack<>();
       stack.push('(');
       String polish="";
       int rank=0;
       //char top=stack.peek();
       int i=0;
       char ch=str.charAt(i);
        while(ch!=' '){
            //top=stack.peek();
            if(stack.isEmpty()){
                System.out.println("INVALID 1");
                return;
            }
            while(stack_precedence(stack.peek())>input_precedence(ch)){
                char temp=stack.pop();
                polish = polish+""+temp;
                rank=rank+rank(temp);
                if(rank<1){
                    System.out.println("INVALID 2");
                    return;
                }
            }
            if(stack_precedence(stack.peek())!=input_precedence(ch)){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
            i++;
            ch=str.charAt(i);
        }
        if(!stack.isEmpty()|| rank!=1){
            System.out.println("INVALID 3");
        }
        else{
            System.out.println("VALID");
            System.out.println(polish);
        }

    }
    public static int input_precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } 
        else if(ch == '*' || ch == '/'){
            return 3;
        }
        else if(ch == '^'){
            return 6;
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
    public static int stack_precedence(char top) {
        if (top == '+' || top == '-') {
            return 2;
        } 
        else if(top == '*' || top == '/'){
            return 4;
        }
        else if(top == '^'){
            return 5;
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
    public static int rank(char temp){
        if(temp=='+'||temp=='-'||temp=='*'||temp=='/'||temp=='('||temp==')'){
            return -1;
        }else{
            return 1;
        }
    }

}

