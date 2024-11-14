import java.util.*;
class Student_Detail{
    Scanner sc=new Scanner(System.in);
    int enrollment_No;
    String name;
    int sem;
    double cpi;

    public void read_Detail(){
        
        System.out.println("enter Student Enrollmentr_No");
        enrollment_No=sc.nextInt();
        sc.nextLine();
        System.out.println("enter Student Name");
        name=sc.nextLine();
        System.out.println("enter Student semester");
        sem=sc.nextInt();
        System.out.println("enter Student cpi");
        cpi=sc.nextDouble();
    }
    public void print_Detail(){
        System.out.println("student detail is:")
        System.out.println("Student Enrollmentr_No:"+enrollment_No);
        System.out.println("Student Name:"+name);
        System.out.println("Student semester:"+sem);
        System.out.println("Student cpi:"+cpi);
    }
}
public class ArrayOfObj_Function_35 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Student_Detail stu[]=new Student_Detail[5];
        for(int i=0;i<stu.length;i++){
             stu[i]=new Student_Detail(); 
            stu[i].read_Detail();
        }
        for(int i=0;i<stu.length;i++){ 
            stu[i].print_Detail();
        }
    }
}
