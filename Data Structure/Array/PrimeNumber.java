import java.util.*;
public class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==0){
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is not prime");
		}
	}
}