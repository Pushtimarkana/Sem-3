import java.util.*;
class Linked_List{
	class Node{
		int data;
		Node link;
	}
	Node first;
	Node last;
	public void insert(int data){
		Node new_n=new Node();
		if(first==null){
			new_n.data=data;
			new_n.link=new_n;
			first=new_n;
			last=new_n;
			return;
		}
		else{
			new_n.data=data;
			new_n.link=first;
			last.link=new_n;
			last=last.link;
		}
	}
	public void count(){
		Node temp=first;
		int i=0;
		int count=0;
		do{
			System.out.println("n["+i+"]="+temp.data);
			temp=temp.link;
			count++;
			i++;
		}
		while(temp!=first);
		System.out.println("number of Node is:"+count);
	}
}
public class Circularly_Linked_58{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Linked_List l1=new Linked_List();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.count();
	}
}