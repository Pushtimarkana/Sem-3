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
	public void sort(){
		Node save=first;
		Node pre2=null;
		Node temp=save.link;
		Node pre=save;
		while(save!=null){
			 temp=save.link;
			 pre=save;
			while(temp!=null){
				//System.out.println("save"+save.data);
				//System.out.println("temp"+temp.data);

				//compare data save and temp
				if(save.data>temp.data){

					//swep both node's link
					Node swep=temp.link;
					pre.link=temp.link;
					temp.link=save;
					if(pre2!=null){
						pre2.link=temp;
					}else{
						first=temp;
					}

					//swep both node's name or pointer
					Node swep2=save;
					save=temp;
					temp=swep2;

					//after swep increment in pre and temp
					pre=temp;
					temp=temp.link;
				}else{
					pre=temp;
					temp=temp.link;
				}
			}
			//increment in pre2 and save
			pre2=save;
			save=save.link;
		}
	}
}
public class Sort_LinkedList_65{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.insert(50);
		l1.insert(60);
		l1.insert(20);
		l1.insert(70);
		l1.insert(5);
		l1.insert(10);
		l1.insert(40);
		l1.insert(10);
		l1.insert(30);
		l1.insert(10);
		l1.display();
		l1.sort();
		l1.display();
	}
}