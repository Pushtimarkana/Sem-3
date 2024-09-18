import java.util.*;
public class Sort_Name_20{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("enter name arr["+i+"]:");
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int k=arr[i].compareTo(arr[j]);
				if(k>0){
					String temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
}