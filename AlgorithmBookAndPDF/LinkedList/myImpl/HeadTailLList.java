package LinkedList.myImpl;
import LinkedList.myImpl.Node;

public class HeadTailLList {
	
	private Node head;
	private Node tail;
	//private T element;
	private int size;
	
	public HeadTailLList(){
		this.head=null;
		this.size=0;
	}
	
	public HeadTailLList(Node headOne){
		this.head=headOne;
		this.head.setNext(null);
	}
}
