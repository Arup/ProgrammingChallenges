package LinkedList.myImpl;

import LinkedList.DNode;

public class DList {
	protected int size;
	protected DNode header,trailer;
	
	public DList(){
		size=0;
		header = new DNode(null,null,null);
		trailer =  new DNode(null,header,null);
		header.setNext(trailer);
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return (size==0);
	}
	
	public DNode getFirst() throws IllegalStateException{
		if(isEmpty()) throw new IllegalStateException("List is empty");
		return header.getNext();
	}
	
	public DNode getLast() throws IllegalStateException{
		if(isEmpty()) throw new IllegalStateException("List is empty");
		return trailer.getPrev();
	}
	
	public DNode getPrev(DNode v) throws IllegalStateException{
		if(isEmpty()) throw new IllegalStateException("List is empty");
		return v.getPrev();
	}
	
	public DNode getNext(DNode v) throws IllegalStateException{
		if(isEmpty()) throw new IllegalStateException("List is empty");
		return v.getNext();
	}
	// add z before v, if v is header then error
	public void addBefore(DNode v,DNode z) throws Exception{
		DNode u=getPrev(v);
//		if (v.equals(header))
//			throw new Exception ("Cannot add before header");
		u.setNext(z);
		z.setNext(v);
		v.setPrev(z);
		z.setPrev(u);
		size++;		
	}
	//Insert z after v, v not a trailer
	public void addAfter(DNode v,DNode z) throws Exception{
//		if (v.equals(trailer))
//			throw new Exception ("Cannot add before header");
		DNode w=getNext(v);
		w.setPrev(z);
		v.setNext(z);
		z.setNext(w);
		z.setPrev(v);
		size++;
	}
	
	public void addFirst(DNode v){
		try {
			addBefore(header,v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addLast(DNode z){
		try {
			addAfter(z,trailer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void remove(DNode D){
		DNode p=getPrev(D);
		DNode n=getNext(D);
		
		p.setNext(n);
		n.setPrev(p);
		D.setNext(null);
		D.setNext(null);
		size--;
	}
	
	public boolean hasPrev(DNode v){
		return v!=header;
	}
	
	public boolean hasNext(DNode u){
		return u!=trailer;
	}
}
