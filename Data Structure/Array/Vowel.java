import java.util.*;

public class Vowel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a charcter:");
        char c=sc.nextLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("charcter is vowel");
        }
        else{
            System.out.println("charcter is not vowel");
        }
    }

}
