import java.util.Stack;

public class LAB42 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            st.push(ch);    
        }

        int count = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) 
        {
                char p = st.pop();
                if (count>0 && p!='*') 
                {
                    count --;
                }
                else if (p == '*') 
                {
                    count++; 
                }
                else if (count == 0) 
                {
                    ans = p + ans; 
                }
        }
        System.out.println(ans);
    }
}