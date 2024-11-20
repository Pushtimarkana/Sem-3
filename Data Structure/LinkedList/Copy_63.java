import java.util.*;
class Linked_list{
    class Node{
        int data;
        Node link;
    }
    Node first;
    Node save=null;
    Node begin;
    //Node pred=null;
    public void insert_at_first(int data){
        
        Node n1=new Node();
        n1.data=data;
        n1.link=first;
        first=n1;

    }
    public void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
    public void display2(){
        Node temp=begin;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
    
    public int copy_Node(Node first){

        
        Node pred;
        if(first==null){
            System.out.println("main Linked list-1 is empty.");
        }
        Node n=new Node();
        n.data=first.data;
        pred=n;
        begin=n;
        save=first;
        save=save.link;

        while(save!=null){
            n=new Node();
            n.data=save.data;
            pred.link=n;
            save=save.link;
            pred=pred.link;

            // if(n.link==null){
            //     return 1;
            // }
        }
        return 1;
    }
}
public class Copy_63{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_list l1=new Linked_list(); 
        Linked_list l2=new Linked_list();
        l1.insert_at_first(5);
        l1.insert_at_first(4);
        l1.insert_at_first(3);
        l1.insert_at_first(2);
        l1.insert_at_first(1);
        System.out.println("Linked list 1 is: ");
        l1.display();
        System.out.println();
        System.out.println("Copied linked list is: ");
        l2.copy_Node(l1.first);
        l2.display2();
    }
}