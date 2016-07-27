package LinkedList.myImpl;

public class Node<T> {
	
	private T data;
	private Node next;
	
	public Node(T data, Node next) {
		//super();
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		//super();
		//Constructor chaining
		this(data,null);
	}
	
	public Node(){
		this(null);
	}

	public Node getNext() {
		return next;
	}
	
	
	public Node getNext(int i) {
		return next;
	}
	
	public void setNext(Node n){
		this.next=n;		
	}
	
	public void setData(T data){
		this.data=data;
	}
	
	public T getData(){
		return data;
	}

}
