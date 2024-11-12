import java.util.*;
public class Addition_Array_30{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("enter a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("enter b["+i+"]["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.println("c["+i+"]["+j+"]:"+c[i][j]);
			}
		}
	}
}