import java.util.*;
public class Doubled_Ended_Queue_52{
	static int f=-1;
	static int r=-1;
	static int queue[];
	static int n;
	//insert at front end
	public static void dq_Ins_Front(int y){
		if(f==0){
			System.out.println("Queue Overflow:");
			return;
		}
		if(f==-1){
			f=r=0;
		}
		else{
			f=f-1;
		}
		queue[f]=y;
	}
	//insert at rear end---ENQUEUE
	public static void dq_Ins_Rear(int y){
		if(r>=n-1){
			System.out.println("Queue Overflow:");
			return;
		}
		r=r+1;
		queue[r]=y;
		if(f==-1){
			f=0;
			return;
		}
	}
	//delete at front end---DEQUEUE
	public static int de_Del_Front(){
		if(f==-1){
			System.out.println("Queue Underflow:");
			return -1;
		}
		int y=queue[f];
		if(f==r){
			f=r=-1;
		}
		else{
			f=f+1;
		}
		return y;	
	}
	//delete at rear end--
	public static int dq_Del_Rear(){
		if(r==-1){
			System.out.println("Queue Underflow:");
			return -1;
		}
		int y=queue[r];
		if(r==f){
			r=f=-1;
		}else{
			r=r-1;
		}
		return y;
	}
	public static void display(){
		for(int i=f;i<=r;i++){
			System.out.println("Queue["+i+"]:"+queue[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		n=5;
		queue=new int[n];
		dq_Ins_Rear(10);
		dq_Ins_Rear(20);
		//dq_Ins_Front(30);
		
		int ans=de_Del_Front();
		// System.out.println(ans);
		dq_Del_Rear();
		dq_Ins_Rear(60);
		display();
	}
}