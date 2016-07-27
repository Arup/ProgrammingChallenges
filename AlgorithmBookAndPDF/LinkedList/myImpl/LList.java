package LinkedList.myImpl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Correcta implementation




import LinkedList.LListInterface;

public class LList<T> implements LListInterface{
	private Node firstNode;
	private int size;
	
	public LList(Node firstNode){
		this.firstNode=firstNode;
	}
	
	public LList(){
		clear();
	}



	@Override
	public int size() {
		return size;
	}

	@Override
	public <T> boolean add(T e) {
		Node newNode=new Node(e);
		
		if(isEmpty()){
			firstNode=newNode;
		}else{
			Node lastNode=getNodeAtIndex(size);
			lastNode.setNext(newNode);
		}
		size++;
		return true;
	}

	@Override
	public <T> boolean add(int index, T element) {
		// TODO Auto-generated method stub
		boolean isSuccessful=true;
		
		if((index >=1)&&(index<=size+1)){
			Node newNode=new Node(element);
			if(isEmpty() || index==1){
				newNode.setNext(firstNode);
				firstNode=newNode;
			}
			else{
				Node nodeBefore=getNodeAtIndex(index-1);
				Node nodeAfter=nodeBefore.getNext();
				newNode.setNext(nodeAfter);
				nodeBefore.setNext(newNode);								
			}
			size++;
		}else{
			isSuccessful=false;
		}
		return isSuccessful;
		
	}

	@Override
	public void clear() {
		firstNode=null;
		size=0;	
	}

	@Override
	public <T> boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node getNodeAtIndex(int index) {
		// TODO Auto-generated method stub
		assert !isEmpty() && (1<=index && index<=size);
		Node currentNode=firstNode;
		for (int count=0;count<index;count++){
			currentNode=currentNode.getNext();
		}
		assert currentNode!=null;
		return currentNode;
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

	
	private boolean isEmpty(){
		boolean result=true;
		
		if(size==0){
			assert firstNode==null;
			result =true;
		}else{
			assert firstNode!=null;
			result=false;
		}
		
		return result;
	}
	
	private void display(){
		//display data
		Node currentNode=firstNode;
		while(currentNode!=null){
			Class<?> c = currentNode.getData().getClass();
			
			
			try {
				Object instance = c.newInstance();
				System.out.println(new Integer((Integer) (currentNode.getData())));
				currentNode=currentNode.getNext();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public void swap(LList lin,int K){

		Node nb =lin.getNodeAtIndex(K);
		Node nl=lin.getNodeAtIndex(size-K);
		
		Node nbBefore=lin.getNodeAtIndex(K-1);
		Node nbAfter=lin.getNodeAtIndex(K+1);
		
		Node nlBefore=lin.getNodeAtIndex((size-K)-1);
		Node nlAfter=lin.getNodeAtIndex((size-K)+1);
		
		nbBefore.setNext(nl);
		nl.setNext(nbAfter);
		
		nlBefore.setNext(nb);
		nb.setNext(nlAfter);		
				
		
	}
	
	public static void main(String args[]){
		
		LList li=new LList();
		Node n1=new Node(new Integer("1"));
		Node n2=new Node(new Integer("2"));
		Node n3=new Node(new Integer("4"));
		Node n4=new Node(new Integer("5"));
		Node n5=new Node(new Integer("7"));
		Node n6=new Node(new Integer("8"));
		
		li.add(1,n1);
//		li.add(2,n2);
//		li.add(3,n3);
//		li.add(4,n4);
//		li.add(5,n5);
//		li.add(6,n6);
		
		li.display();
		
	//	li.swap(li, 2);
		
	//	li.display();
		
		
		
	}


}
