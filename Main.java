import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node a=new Node(3);
		Node b=new Node(5,a);
		Node c=new Node(2,b);
		Node head=new Node(8,c);
		Node p=partition(head, 4);
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}
		//System.out.println(kToLast(head, 5));
	}
	
	//partition a linked list around a value x
	//all nodes less than x come before all nodes greater than or equal to x
	//create a list, higher value add after the head, smaller value add before the head
	
	public static Node partition(Node n, int x){
		Node before=null, after=null;//set to null, then each step move forward //pointers will move backwards
		while(n!=null){
			Node p=n.next;//mark orgianl n.next since we are going to change n.next
			if(n.data<x){
				n.next=before;
				before=n;
			}else{
				n.next=after;
				after=n;
			}
			n=p;
		}
		//merger two lists
		if(before==null) return after;//if there is no data smaller than x, before will be null, return after
		Node head=before;
		while(before.next!=null){
			before=before.next;
		}
		before.next=after;
		return head;
		
	}
	
}
