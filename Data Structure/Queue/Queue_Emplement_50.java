import java.util.*;
public class Queue_Emplement_50{
	static int f=-1;
	static int r=-1;
	static int queue[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter size of Queue:");
		int n=5;
		queue=new int[n];
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		enQueue(50);
		int q=deQueue();
		System.out.println(q);
		enQueue(60);
		display();


	}
	public static void enQueue(int data){
		if(r>=queue.length-1){
			System.out.println("Queue Overflow:");
			return;
		}
		r=r+1;
		queue[r]=data;
		if(f==-1){
			f=0;
			return;
		}
	}
	public static int deQueue(){
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
	public static void display(){
		for(int i=f;i<=r;i++){
			System.out.println("Queue["+i+"]:"+queue[i]);
		}
	}
}