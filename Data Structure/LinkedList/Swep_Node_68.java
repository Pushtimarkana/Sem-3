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
	public void swep(){
		Node save=first.link;
		Node pre=first;
		Node temp=pre;
		int c=0;
		while(pre.link!=null){
			Node swep=save.link;
			save.link=pre;
			pre.link=swep;
			if(c==0){
				first=save;
				c++;
			}
			 temp=pre;
			if(pre.link!=null){
				pre=pre.link;
				save=pre.link;
				temp.link=save;
			}
		}
	}
}
public class Swep_Node_68{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		l1.insert(70);
		l1.insert(80);
		l1.display();
		l1.swep();
		l1.display();
	}
}