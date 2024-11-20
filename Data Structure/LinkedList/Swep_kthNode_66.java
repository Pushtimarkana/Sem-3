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
	public int count(){
		int c=0;
		Node temp=first;
		while(temp!=null){
			temp=temp.link;
			c++;
		}
		return c;
	}
	public void swep(int k){
		int count=count();
		//if element gretaer count not available
		if(k>count){
			System.out.println("k th element is not available:");
			return;
		}
		if(count==2*k-1){
			return;
		}

		Node save=first;
		Node pre=null;
		for(int i=1;i<k;i++){
			pre=save;
			save=save.link;
		}

		Node temp=first;
		Node pre_temp=null;
		for(int i=1;i<(count-k+1);i++){
			pre_temp=temp;
			temp=temp.link;
		}
		if(pre!=null){
			pre.link=temp;
		}
		if(pre_temp!=null){
			pre_temp.link=save;
		}
		Node swep=temp.link;
		temp.link=save.link;
		save.link=swep;

		if(k==1){
			first=temp;
		}
		if(k==count){
			first=save;
		}
	}
}
public class Swep_kthNode_66{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		int ans=l1.count();
		System.out.println(ans);
		l1.swep(1);
		l1.display();
	}
}