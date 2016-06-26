package CarranoBook.chap03;

public class Node {
	
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	public Node(Object element){
		this(element,null);
	}
	private Object element;
	private Node next;
	
	public void setNext(Node n){
		this.next=n;
	}

}
