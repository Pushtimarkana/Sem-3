import java.util.*;
class Bank_Account{
	Scanner sc=new Scanner(System.in);
	int account_No;
	double balance=1000;
	String account_Holder;
	String name;
	public void deposit_Money(){
		System.out.println("enter money for deposit:");
		double temp=sc.nextDouble();
		balance+=temp;
	}
	public void withdraw_Money(){
		System.out.println("enter money for withdraw:");
			double temp=sc.nextDouble();
		try{
			if(temp>balance){
				System.out.println("Insephisiant balance");
			}
			else{
				balance-=temp;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public void check_Balance(){
		System.out.println("current balance is:"+balance);
	}
}
public class Bank_Detail_37{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank_Account acc[]=new Bank_Account[5];
		for(int i=0;i<acc.length;i++){
			acc[i]=new Bank_Account();
		}
		System.out.println("enter no of obj betwwen 1 to 5:");
		int a=sc.nextInt();
		acc[a].deposit_Money();
		acc[a].withdraw_Money();
		acc[a].check_Balance();
	}
}