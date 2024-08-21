import java.util.*;
public class Power_6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int x=sc.nextInt();
		System.out.println("enter number");
		int y=sc.nextInt();
		int ans=1;
		for(int i=0;i<y;i++){
			ans=ans*x;
		}
		System.out.println("answer of x^y :"+ans);
	}
}