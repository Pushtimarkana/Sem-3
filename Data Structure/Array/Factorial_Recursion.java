import java.util.*;
public class Factorial_Recursion{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for factorial:");
		int n=sc.nextInt();
		Factorial f1=new Factorial();
		int ans=f1.fact(n);
		System.out.println("factorial :"+ans);
	}
}
class Factorial{
	public int fact(int n){
		if(n!=0){
			return n*fact(n-1);
		}
		else{
			return 1;
		}
	}
}