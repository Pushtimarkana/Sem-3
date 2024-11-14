import java.util.*;
public class Convert_Temperature_36 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature:");
        double t=sc.nextDouble();
        System.out.println("you enter temperature in celsius then enter c orfahren hint then enter f:");
        char temp=sc.next().charAt(0);
        if(temp=='c'){
            conert_Fahrenhit(t);
        }
        else if(temp=='f'){
            convert_Celsius(t);
        }

    }
    public static void conert_Fahrenhit(double t){
        double f=((9f/5)*(t)+32);
        System.out.println(f);
    }
    public static void convert_Celsius(double t){
        double c=(t-32)*(5f/9);
        System.out.println(c);
    }
}
