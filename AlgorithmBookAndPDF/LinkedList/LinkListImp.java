package LinkedList;

public class LinkListImp<T> implements LListInterface {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int length;
	
	public <T> boolean add(T newEntry) {
		Node newNode=new Node(newEntry);
		
			if(isEmpty()){
				firstNode=newNode;
			}else{
				lastNode.next=newNode;
			}
			lastNode=newNode;
			incrementSize(size());
		return true;
	}

	private boolean isEmpty() {
		return (size()==0);
	}

	public <T> void add(int index, T element) {
		// TODO Auto-generated method stub

	}


	public void clear() {
		firstNode=null;
		lastNode=null;
		length=0;
	}


	public <T> boolean contains(T element) {
		boolean isFound=false;
		Node currentNode=firstNode;
		
		while(!isFound && (currentNode!=null)){
			if(element.equals(currentNode.data)){
				isFound=true;
			}else{
				currentNode=currentNode.next;
			}
		}
				
		return isFound;
	}

	@Override
	public <T> T getNodeAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T replace(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		return length;
	}
	
	public void incrementSize(int length){
		length=length+1;
	}

}

class Node<T>{
	
	T data;
	Node<T> next;
	
	Node (T data){
		this.data=data;
		this.next=null;
	}
	Node(T daya,Node<T> nextNode){
		this.data=data;
		this.next=nextNode;
	}
	T getData(){
		return data;
	}
	void setData(T newData){
		this.data=newData;
	}
	
	Node<T> getNextNode(){
		return next;
	}
	void setNextNode(Node<T> newNode){
		this.next=newNode;
	}
	
	
}