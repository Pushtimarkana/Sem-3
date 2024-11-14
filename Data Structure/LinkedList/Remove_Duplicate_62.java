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
	public void ins_At_Last(int data){
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
		//we can also use use insertAtFirst
		// n1.link=first;
		// first=n1;
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
	public void Remove(){
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
					pre=temp;
					temp=temp.link;
				}
			}
			save=save.link;
		}
	}
}
public class Remove_Duplicate_62{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.ins_At_Last(1);
		l1.ins_At_Last(2);
		l1.ins_At_Last(3);
		l1.ins_At_Last(1);
		l1.ins_At_Last(4);
		l1.ins_At_Last(1);
		l1.ins_At_Last(2);
		l1.ins_At_Last(4);
		l1.ins_At_Last(5);
		l1.Remove();
		l1.display();
	}
}