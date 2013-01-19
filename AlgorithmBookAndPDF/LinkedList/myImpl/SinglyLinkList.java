package LinkedList.myImpl;

public class SinglyLinkList {
	
	private Node firstNode;
	private T element;
	private int size;
	
	public SinglyLinkList(Node firstNode,T ele){
		this.firstNode=firstNode;
		this.element=ele;
	}

	
	public SinglyLinkList(Node firstNode){
		this.firstNode=firstNode;
		this.element=null;
	}
	
	private Node getNodeAt(int givenPosition){		
		Node currentNode=firstNode;		
		for(int count=1;count<givenPosition;count++){
			currentNode=currentNode.getNext();			
		}
		return currentNode;
	}
	
	public boolean isEmpty(){		
		return (size==0 || this.firstNode!=null);		
	}
	
	protected int getSize(){
		return size;
	}
	
	public boolean add(T newEntry){
		Node newNode=new Node(newEntry);
		
		if(isEmpty())
			firstNode=newNode;
		else{
			Node lastNode=getNodeAt(size);
			lastNode.setNext(newNode);
		}
		size++;
		
		return true;
		
	}
	
	public boolean add(int position,T newEntry){
		boolean isadded=true;
		
		if((position>=1)&&(position<=size+1)){
		Node newNode=new Node(newEntry);
		
		if(isEmpty()||position==1){
			newNode.setNext(firstNode);
			firstNode=newNode;
		}
		else{
			Node nodeBefore=this.getNodeAt(position-1);
			Node nodeAfter=nodeBefore.getNext();
			newNode.setNext(nodeAfter);
			nodeBefore.setNext(newNode);
		}
		size++;
		
		isadded= true;
		}else{
			isadded=false;
		}
		return isadded;
	}
	
}
