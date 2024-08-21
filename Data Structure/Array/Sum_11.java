import java.util.*;
public class Sum_11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number");
		int n=sc.nextInt();
		int sum=0;
		int sum2=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				sum=sum+j;
			}
			sum2=sum2+sum;
			sum=0;
		}
		System.out.println("sum of :"+sum2);
	}
}