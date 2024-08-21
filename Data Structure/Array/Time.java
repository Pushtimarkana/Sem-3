import java.util.*;
public class Time{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter second");
		int n=sc.nextInt();
		int h=0;
		int m=0;
		int s=0;
		while(n!=0){
			if(n>=3600){
				h++;
				n=n-3600;
			}
			else if(n>=60){
				m++;
				n=n-60;
			}
			else if(n>=1){
				s++;
				n=n-1;
			}
			
		}
		System.out.println("hour :"+h);
		System.out.println("minite :"+m);
		System.out.println("second :"+s);
	}
}