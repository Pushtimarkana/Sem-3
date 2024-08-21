import java.util.*;
public class Armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=1000;i++){
			int i1=i;
			int temp=i;
			
			int r=0,c=0;
			Double sum=0.0;
			while(i1!=0){
				i1=i1/10;
				c++;
			}
			while(temp!=0){
				 r=temp%10;
				 temp=temp/10;
				 double a=Math.pow(r,c);
				sum=sum+a;
			}
			if(i==sum){
				System.out.println("Armstrong number:"+i);
			}
		}
	}
}