import java.util.*;
class Doubly_List{
	Node first;
	Node last;
	int length=0;
	class Node{
		int data;
		Node lptr;
		Node rptr;
		public Node(int data){
			this.data=data;
			this.lptr=null;
			this.rptr=null;

		}
	}
	public void ins_At_First(int data){
		Node n=new Node(data);
		length++;
		if(first==null){
			n.lptr=null;
			n.rptr=null;
			first=n;
			last=n;
			return;
		}
		else{
			first.lptr=n;
			n.rptr=first;
			first=n;
		}
	}
	public ins_At_Last(int data){
		Node n=new Node(data);
		length++;
		if(first==null){
			n.lptr=null;
			n.rptr=null;
			first=n;
			last=n;
			return;
		}else{
			last.rptr=n;
			n.lptr=last;
			last=n;
		}
	}
	public void delete(int data){
		if(first==null){
			System.out.println("under flow:");
			return;
		}
		if(data==first.data){
			first=first.rptr;
			first.lptr=null;
			return;
		}
		Node save=first.rptr;
		Node pre=first;
		while(save!=null && data!=save.data){
				pre=save;
				save=save.rptr;
			}
			if(save==null){
				System.out.println("Node not fount");
			}else{
				if(save==last){
					pre.rptr=save.rptr;
					last=pre;
				}
				pre.rptr=save.rptr;
				save.rptr.lptr=pre;
			}
	}
	//delete at specific position
	public void del_AtPosition(int index){
		int i=2;
		if(index==1){
			first=first.rptr;
			first.lptr=null;
			i++;
			return;
		}
		Node save=first.rptr;
		Node pre=first;
		while(i<length && i!=index){
			pre=save;
			save=save.rptr;
			i++;
		}
		if(index>length){
			System.out.println("Node not fount");
			return;
		}
		else if(i==length){
			pre.rptr=save.rptr;
			last=pre;
			return;			
		}
		else{
			pre.rptr=save.rptr;
			save.rptr.lptr=pre;
			return;
		}

	}
	//display link first to last
	public void display(){
		int i=0;
		Node save=first;
		while(save!=null){
			System.out.print("n["+i+"]:"+save.data+" , ");
			save=save.rptr;
			i++;
		}
		System.out.println();
	}
	//display link last to first
	public void display2(){
		int i=0;
		Node save=last;
		while(save!=null){
			System.out.print("n["+i+"]:"+save.data+" , ");
			save=save.lptr;
			i++;
		}
		System.out.println();
	}
}
public class Doubly_Link_Implement_72{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doubly_List d1=new Doubly_List();
		d1.ins_At_First(10);
		d1.ins_At_First(20);
		d1.ins_At_First(30);
		d1.ins_At_First(40);
		d1.ins_At_First(50);
		d1.display();
		//d1.delete(50);
		//d1.display();
		d1.del_AtPosition(10);
		d1.display();
		d1.display2();
	}
}