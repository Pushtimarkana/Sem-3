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
	public void remove(){
		Node save=first;
		while(save!=null){

			Node temp=save.link;
			Node pre=save;
			
			//System.out.println("save:"+save.data+"temp:"+temp.data);
			while(temp!=null){
				//System.out.println("save:"+save.data+"temp:"+temp.data);
				if(save.data==temp.data){
					pre.link=temp.link;
					temp=temp.link;
				}
				else{
					break;
					//pre=temp;
					//temp=temp.link;
				}
			}
			save=save.link;
		}
	}
}
public class Remove_FromSorted_69{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.insert(1);
		l1.insert(1);
		l1.insert(6);
		l1.insert(13);
		l1.insert(13);
		l1.insert(13);
		l1.insert(13);
		l1.insert(27);
		l1.insert(27);
		l1.display();
		l1.remove();
		l1.display();
	}
}