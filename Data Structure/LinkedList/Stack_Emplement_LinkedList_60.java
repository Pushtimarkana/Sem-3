import java.util.*;
class Linked_List{
	static int count=0;
	Node first;
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	//ins_At_First method of LinkedList named push
	public void push(int data){
		Node n1=new Node(data);
		n1.link=first;
		first=n1;
		count++;
	}

	//del_At_first method of LinkedList named pop
	public void pop(){
		if(first==null){
			System.out.println("stack Underflow:");
			return;
		}
		else{
			Node save=first;
			first=first.link;
			save=null;
		}
		count--;
	}

	//travel method or display 
	public void display(){
		Node temp=first;
		int i=count;
		while(temp!=null){
			System.out.print("n["+i+"]="+temp.data);
			temp=temp.link;
			i--;
		}
		System.out.println("");
	}
}
public class Stack_Emplement_LinkedList_60{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Linked_List obj=new Linked_List();
		obj.push(44);
		obj.push(33);
		obj.push(22);
		obj.push(11);
		obj.display();
		obj.pop();
		obj.display();
		
		
	}
}