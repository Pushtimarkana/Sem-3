import java.util.*;
public class Remove_Duplicate_25{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println(" enter a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println("before:");
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					for(k=j;k<n-1;k++){
						a[k]=a[k+1];
					}
					k--;
					n--;
				}
			}
		}
		System.out.println("after:");
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
	}
}