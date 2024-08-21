import java.util.*;
public class Area_Circle{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle:");
        double r = sc.nextDouble();
        double a;
        a = Math.PI * r * r;

        System.out.println("Area os circle is" + a);
    
    }
}