    import java.util.*;
    public class L7p41 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //getting string from user
            System.out.println("enter string with brakets only");
            String str=sc.nextLine();

            Stack<Character> stack=new Stack<>();
            int i=0,count=0;
            char ch=str.charAt(0);
            int n=str.length();
            for(i=0;i<n;i++){
                ch=str.charAt(i);
                //pushing opening brackets in stack

                if(ch == '(' || ch == '{' || ch == '[' ){
                    stack.push(ch);
                }
                //if there is no any opening brackets then the given string is invalid
                if(stack.isEmpty()){
                    System.out.println("invalid string");
                }
                
                char x;
                //checking all opening brackets have closing brackets or not
                if(ch ==')'){
                    x=stack.pop();
                    //string has ')' if stack pop opening brackets { and [ then not balanced string
                    if(x!='('){
                        count++;
                        System.out.println("not balanced 1");
                        break;
                    }
                    
                }
                else if(ch =='}'){
                    x=stack.pop();
                    if(x!='{'){
                        count++;
                        System.out.println("not balanced 2");
                        break;
                    }
                }
                else if(ch ==']'){
                    x=stack.pop();
                    if(x!='['){
                        count++;
                        System.out.println("not balanced 3");
                        break;
                    }
                }
            }
            if(count==0 && stack.isEmpty()){
                System.out.println("string is balanced");
            }
            else{
                System.out.println("string is not balanced");
            }
        }
    }