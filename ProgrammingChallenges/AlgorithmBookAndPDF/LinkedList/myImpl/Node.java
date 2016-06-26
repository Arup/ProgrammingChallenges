package LinkedList.myImpl;

class Node {
	
	private T data;
	private Node next;
	
	public Node(T data, Node next) {
		//super();
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		//super();
		this.data = data;
		this.next=null;
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
	
	
	

}
