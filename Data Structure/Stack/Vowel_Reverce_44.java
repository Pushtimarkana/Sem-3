import java.util.*;
public class Vowel_Reverce_44{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine().toLowerCase();
		//int i=0;
		int n=str.length();
		StringBuilder str_b=new StringBuilder(n);
		int j=0;
		//char c=str.charAt(i);
		String new_str="";
		for(int i=0;i<n;i++){
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				String str2=str.substring(j,i);
				String str3=str.substring(i);
				str_b.append(str2);
				new_str=str_b.reverse()+str3;
				// String rev="";
				// for(int k=str2.length()-1;k>=0;k--){
				// 	c=str2.charAt(k);
				// 	rev=rev+c;

				// }
				// new_str=rev+str3;
			}
		}
		System.out.println(new_str);
	}
}