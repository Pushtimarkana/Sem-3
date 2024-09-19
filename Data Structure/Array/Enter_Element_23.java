import java.util.*;
public class Enter_Element_23{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={2,4,8,10,15};
        System.out.println("enter element");
        int e=sc.nextInt();
        int b[]=new int[6];
        
        int i=0;
		while(a[i]<e){
			b[i]=a[i];
			i++;
		}
		b[i]=e;
		i++;
		while(i<6){
			b[i]=a[i-1];
			i++;
		}
		for(int j=0;j<6;j++){
			System.out.println("b["+j+"]:"+b[j]);
		}
	}
}