import java.util.*;
class Node{
	int data;
	Node link;
}
class LinkedList{
	Node first;
	public void insertAtFirst(int data){
		Node new_n=new Node();
		new_n.data=data;
		new_n.link=first;
		first=new_n;
	}
	public void insertAtLast(int data){
		Node new_n=new Node();
		Node temp=first;
		while(temp.link!=null){
			temp=temp.link;
		}
		new_n.data=data;
		temp.link=new_n;
	}
	public void travel(){
		Node temp=first;
		int i=0;
		while(temp!=null){
			System.out.println("n["+i+"]="+temp.data);
			temp=temp.link;
			i++;
		}
	}
	public void insOrd(int data){
		Node new_n=new Node();
		if(first==null){
			new_n.data=data;
			first=new_n;
			return;
		}
		//insert at first position
		else if(data<=first.data){
			new_n.link=first;
			new_n.data=data;
			first=new_n;
		}
		//insert at middle and last position
		else{
			Node save=first;
			while(save.link!=null && data>save.link.data){
				save=save.link;
			}
			new_n.data=data;
			new_n.link=save.link;
			save.link=new_n;
		}
	}
	public void deleteAtFirst(){
		if(first==null){
			System.out.println("stack Underflow:");
		}
		else{
			Node save=first;
			first=first.link;
			save=null;
		}
	}
	public void deleteAtLast(){
		if(first==null){
			System.out.println("stack Underflow:");
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
	}
	public void deleteAny(int data){
		if(first==null){
			System.out.println("stack Underflow:");
		}
		else{
			Node pre=null;
			Node save=first;
			while(data!=save.data && save.link!=null){
				pre=save;
				save=save.link;
			}
			if(save.data!=data){
				System.out.println("Node not found");
				return;
			}
			if(data==first.data){
				first=first.link;
				save=null;
				return;
			}
			pre.link=save.link;
			save=null;
		}
	}
}
public class Linked_List{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Node n1=new Node(50);
		LinkedList l1=new LinkedList();
		// l1.insertAtFirst(40);
		// l1.insertAtLast(100);
		// //l1.travel();
		// //l1.deleteAtFirst();
		// //l1.deleteAtLast();
		// l1.insOrd(45);
		// l1.deleteAny(100);
		// l1.travel();
		String str="enter 1 for insertAtfirst, 2 for insertatlast,3 for travel,4 for insert at order,5 for delete first, 6 for deletelast, 7 for delete any and 8 for exit:";
		System.out.println(str);
		int n=0; 
		int data;                        
		while(n!=8){
			System.out.println("enter betwwen 1 to 8 for operation in linked list:");
			n=sc.nextInt();
			switch(n){
				case 1:System.out.println("enter number 1:");
						data=sc.nextInt();
						l1.insertAtFirst(data);
						break;
				case 2: System.out.println("enter number 2:");
						data=sc.nextInt();
						l1.insertAtLast(data);
						break;
				case 3:l1.travel();
						break;
				case 4:System.out.println("enter number insert order:");
						data=sc.nextInt();
						l1.insOrd(data);
						break;
				case 5:	l1.deleteAtFirst();
						break;
				case 6:l1.deleteAtLast();
						break;
				case 7:System.out.println("enter number what you want delete:");
						data=sc.nextInt();
						l1.deleteAny(data);
						break;								
				case 8: n=8;
						break;		
			}
		}
	}
}