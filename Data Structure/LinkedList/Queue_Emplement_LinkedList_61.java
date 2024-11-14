import java.util.*;
class LinkedList{
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

	//insertAtFirst like queue push
	public void push(int data){
		Node n1=new Node(data);
		n1.link=first;
		first=n1;
		count++;
	}

	//deleteAtLast like as pop
	public void pop(){
		if(first==null){
			System.out.println("Queue Underflow:");
		}
		else{
			Node save=first;
			Node pre=null;
			while(save.link!=null){
				pre=save;
				save=save.link;
			}
			pre.link=null;
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
public class Queue_Emplement_LinkedList_61{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			LinkedList l1=new LinkedList();
			l1.push(10);
			l1.push(20);
			l1.push(30);
			l1.push(40);
			l1.display();
			l1.pop();
			l1.display();
	}
}