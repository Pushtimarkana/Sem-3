import java.util.*;
class LinkedList{
	Node first;
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	//insert at last position
	public void insert(int data){
		Node n1=new Node(data);
		Node save=first;
		if(first==null){
			first=n1;
			return;
		}
		while(save.link!=null){
			save=save.link;
			
		}
		save.link=n1;
	}
	public void display(){
		Node temp=first;
		int i=0;
		while(temp!=null){
			System.out.print("n["+i+"]="+temp.data);
			temp=temp.link;
			i++;
		}
		System.out.println("");
	}
	public void add_GCD(){
		Node save=first;
		Node temp=save.link;
		while(temp!=null){
			int a=save.data;
			int b=temp.data;
			int gcd=1;
			for(int i=1;i<=a && i<=b;i++){
				if(a%i==0 && b%i==0){
					gcd=i;
				}
			}
			Node n=new Node(gcd);
			save.link=n;
			n.link=temp;
			save=temp;
			temp=temp.link;
		}
	}
}
public class GCD_Node_67{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.insert(18);
		l1.insert(6);
		l1.insert(10);
		l1.insert(3);
		l1.display();
		l1.add_GCD();
		l1.display();
	}
}