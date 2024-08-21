import java.util.*;
public class Year_Days_10{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nuber of days :");
		int n=sc.nextInt();
		int y=0,w=0,d=0;
		while(n!=0){
			if(n>=365){
				y++;
				n-=365;
			}
			else if(n>=7){
				w++;
				n-=7;
			}
			else if(n>=1){
				d++;
				n-=1;
			}
		}
		System.out.println("year:"+y+" , week:"+w+" , days:"+d);
	}
}