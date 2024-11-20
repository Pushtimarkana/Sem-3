import java.util.*;
class Circular_Linked{
	Node first;
	Node last;
	Node first2;
	Node last2;
	int length=0;
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
		length++;
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
	public void split(){
		Node save=first;
		Node pre=first;
		System.out.println("length:"+length);
		// do{
		// 	save=save.link.link;
		// 	pre=pre.link;
		// }
		// while(save!=first && save.link!=first);
		// System.out.println("Middle is:"+pre.data);
		if(length%2==0){
			for(int i=0;i<length/2-1;i++){
				save=save.link.link;
				pre=pre.link;
			}
			System.out.println("Middle is:"+pre.data);
			first2=pre.link;
			last2=save.link;
			last2.link=first2;
			System.out.println("last2"+last2.data);
			pre.link=first;
			last=pre;
			display();
			display2();
			return;
		}
		else{
			do{
				save=save.link.link;
				pre=pre.link;
			}while(save!=first && save.link!=first);
			first2=pre.link;
			last2=save;
			last2.link=first2;
			pre.link=first;
			last=pre;
			display();
			display2();
		 }
	}
	public void display(){
		int i=0;
		Node save=first;
		do{
			System.out.print("n["+i+"]"+save.data+" ");
			save=save.link;
			i++;
		}
		while(save!=first);
		System.out.println();
	}
	public void display2(){
		int i=0;
		Node save=first2;
		do{
			System.out.print("n2["+i+"]:"+save.data+" ");
			save=save.link;
			i++;
		}
		while(save!=first2);
		System.out.println();
	}
}
public class Split_Circular_74{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circular_Linked c1= new Circular_Linked();
		c1.ins_At_First(10);
		c1.ins_At_First(20);
		c1.ins_At_First(30);
		c1.ins_At_First(40);
		c1.ins_At_First(50);
		c1.ins_At_First(60);
		c1.display();
		c1.split();
		//c1.display();
		//c1.display2();
	}
}