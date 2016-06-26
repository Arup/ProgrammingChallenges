package CarranoBook.chap03;

public class SLinkListHead {
	
	Node head;
	int size;
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SLinkListHead(Node head, int size) {
		this.head = head;
		this.size = size;
	}

	public SLinkListHead() {
		this(null,0);
	}
	
	public void addFirst(Node v){
		v.setNext(head);
		head=v;
		size=size+1;
	}
	


	public Object display(int size) {
		// TODO Auto-generated method stub
		if(size==0)
			return this.head.getElement();
		else
			return this.head.getNext().getElement();
	}

	

}
