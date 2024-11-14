import java.util.Scanner;
public class LAB44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char c;
        String part="";
        String rev,part2;
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            for (int i = 1; i < S.length(); i++) {
                c=S.charAt(i);
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                 {
                    rev=S.substring(0,i);
                    for (int j =rev.length()-1 ; j >=0 ; j--) {
                        part=part+""+rev.charAt(j);
                    }
                    part2=S.substring(i, S.length());
                    S=part+part2;
                    part="";
                }
            }
            System.out.println(S);
        }
    }
}


// import java.util.Scanner;

// public class LAB42 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt(); // no of test case
//         char c;
//         LAB42 r = new LAB42();
//         String part,part2;
//         String rev;
//         while (T-- > 0) {
//             int N = sc.nextInt(); // Length of the string
//             String S = sc.next(); // The input string
//             for (int i = 1; i < S.length(); i++) {
//                 c=S.charAt(i);
//                 if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//                     rev=S.substring(0,i);
//                     part=r.reverse(rev);
//                     part2=S.substring(i, S.length());
//                     S=part+part2;
//                 }
//             }
//             System.out.println(S);
//         }
//     }
//     public String reverse(String s){
//         int n = s.length()-1;
//         String rev="";
//         for (int i =n ; i >=0 ; i--) {
//             rev=rev+""+s.charAt(i);
//         }
//         return rev;
//     }
// }

// import java.util.Scanner;
// public class LAB29 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         char c;
//         String rev,part2;
//         while (T-- > 0) {
//             String S = sc.next();
//             for (int i = 1; i < S.length(); i++) {
//                 c=S.charAt(i);
//                 StringBuilder r = new StringBuilder();
//                 if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
//                 {
//                     rev=S.substring(0,i);
//                     r.append(rev);
//                     r=r.reverse();
//                     part2=S.substring(i, S.length());
//                     S=r+part2;
//                 }
//             }
//             System.out.println(S);
//         }
//     }
// }