import java.util.*;
public class Multiplication_Array_31{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][2];
		int b[][]=new int[2][3];
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.println("enter a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.println("enter b["+i+"]["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=0;
				for(int k=0;k<2;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("a["+i+"]["+j+"]:"+c[i][j]);
			}
		}
	}
}