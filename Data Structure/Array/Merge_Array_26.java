import java.util.*;
public class Merge_Array_26{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={3,5,1,4,8};
		int b[]={2,9,7,6,10};
		int c[]=new int[10];
		
		for(int i=0;i<10;i++){
			if(i<5){
				c[i]=a[i];
			}
			else if(i>4 && i<10){
				c[i]=b[i-5];
			}
		}
		int min=c[0];
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(c[i]>c[j]){
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(c[i]);
		}
	}
}