import java.util.*;
class Employee_Detail{
    int employee_Id;
    String name;
    String designation;
    double salary;
}
public class Employee_Detail_34 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Employee_Detail e1=new Employee_Detail();
        System.out.println("enter Employee_Id:");
        e1.employee_Id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter Employee Name:");
        e1.name=sc.nextLine();
        System.out.println("enter Employee Designation:");
        e1.designation=sc.nextLine();
        System.out.println("enter Employee Salary:");
        e1.salary=sc.nextDouble();

        System.out.println("Employee_Id:"+e1.employee_Id);
        System.out.println("Employee Name:"+e1.name);
        System.out.println("Employee Designation:"+e1.designation);
        System.out.println("Employee Salary:"+e1.salary);
    }
}
