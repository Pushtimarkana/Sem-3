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
	public void delete_Alt(){
		Node save=first.rptr;
		while(save!=null && save.rptr!=null){
			save.lptr.rptr=save.rptr;
			save=save.rptr.rptr;
			if(save==last){
				save.lptr.rptr=null;
				last=save.lptr;
			}
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
public class Delete_AlterNode_DL_73{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doubly_List d1=new Doubly_List();
		d1.ins_At_First(10);
		d1.ins_At_First(20);
		d1.ins_At_First(30);
		d1.ins_At_First(40);
		d1.ins_At_First(50);
		d1.ins_At_First(60);
		d1.ins_At_First(70);
		d1.ins_At_First(80);
		d1.display();
		d1.delete_Alt();
		d1.display();
		//d1.display2();
	}
}