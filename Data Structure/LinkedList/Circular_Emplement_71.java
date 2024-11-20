import java.util.*;
class Circular_Linked{
	Node first;
	Node last;
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	public void ins_At_First(int data){
		Node n=new Node(data);
		if(first==null){
			last=n;
			first=n;
			n.link=n;
			return;
		}
		else{
			n.link=first;
			first=n;
			last.link=first;
		}
	}
	public void ins_At_last(int data){
		Node n=new Node(data);
		if(first==null){
			last=n;
			first=n;
			n.link=n;
			return;
		}
		else{
			last.link=n;
			n.link=first;
			last=n;
		}
	}
	public void delete(int data){
		if(first==null){
			System.out.println("Linked_List is underflow:");
		}
		else{
			if(data==first.data){
				first=first.link;
				last.link=first;
				return;
			}
			Node save=first.link;
			Node pre=first;
			while(data!=save.data && save!=first){
				pre=save;
				save=save.link;
			}
			if(save.data!=data){
				System.out.println("Node not fount");
			}else{
				if(save==last){
					pre.link=save.link;
					last=pre;
				}
				pre.link=save.link;
			}
		}
	}
	public void display(){
		int i=0;
		Node save=first;
		do{
			System.out.print("n["+i+"]"+save.data);
			save=save.link;
			i++;
		}
		while(save!=first);
		System.out.println();
	}
}
public class Circular_Emplement_71{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circular_Linked c1= new Circular_Linked();
		c1.ins_At_First(10);
		c1.ins_At_First(20);
		c1.ins_At_First(30);
		c1.ins_At_First(40);
		c1.display();
		c1.delete(30);
		c1.display();
		c1.ins_At_last(50);
		c1.ins_At_last(60);
		c1.ins_At_last(70);
		c1.display();
	}
}