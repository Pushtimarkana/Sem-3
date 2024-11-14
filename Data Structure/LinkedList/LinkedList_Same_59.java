import java.util.*;
class LinkedList{
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	Node first;
	public void insert(int data){
		Node new_n=new Node(data);
		new_n.link=first;
		first=new_n;
	}
	public int[] display(){
		Node temp=first;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.link;
		}
		int a[]=new int[count];
		int i=0;
		temp=first;
		while(temp!=null){
			a[i]=temp.data;
			temp=temp.link;
			i++;
		}
		return a;
	}
}
public class LinkedList_Same_59{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		int c1=0,c2=0,n=0;
		// l1.insert(10);
		// l1.insert(20);
		// l2.insert(10);
		// l2.insert(20);
		while(n!=3){
			System.out.println("enter 1 for give input in linked_list 1 and 2 for linked 2 and 3 for exit");
			n=sc.nextInt();
			if(n==1){
				System.out.println("enter value");
				int data=sc.nextInt();
				l1.insert(data);
				c1++;
			}
			if(n==2){
				System.out.println("enter value");
				int data=sc.nextInt();
				l2.insert(data);
				c2++;
			}
			if(n==3){
				n=3;
			}
		}

		int[] array_a=l1.display();
		int[] array_b=l2.display();
		int c=0;
		if(c1==c2){
			for(int i=0;i<c1;i++){
				System.out.println("a["+i+"]:"+array_a[i]);
				System.out.println("b["+i+"]:"+array_b[i]);
				if(array_a[i]!=array_b[i]){
					c++;
					break;
				}
			}
		}else{
			System.out.println("Both linked list are not same");
			return;
		}
		if(c==0){
			System.out.println("Both linked list are same");
		}
		else{
			System.out.println("Both linked list are not same");
		}
	}
}