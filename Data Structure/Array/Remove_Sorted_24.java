import java.util.*;
public class Remove_Sorted_24{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={2,4,8,10,15};
		for(int i=0;i<5;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
        System.out.println("enter element which you want to delete");
        int e=sc.nextInt();
        int b[]=new int[4];
        int i=0;
        while(a[i]<e){
			b[i]=a[i];
			i++;
		}
		while(i<4){
			b[i]=a[i+1];
			i++;
		}
		for(int j=0;j<4;j++){
			System.out.println("b["+j+"]:"+b[j]);
		}
	}
}