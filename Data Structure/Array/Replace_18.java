import java.util.*;
public class Replace_18{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter element a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println("enter first number");
		int n1=sc.nextInt();
		int temp1=n1;
		System.out.println("enter second number");
		int n2=sc.nextInt();
		int temp2=n2;
		int index1=0;
		int index2=0;
		for(int i=0;i<n;i++){
			if(a[i]==n1){
				index1=i;
				a[i]=temp2;
				i++;
			}
			if(a[i]==n2){
				index2=i;
				a[i]=temp1;
			}
		}
		System.out.println("index1:"+index1);
		System.out.println("index2:"+index2);
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
	}
}