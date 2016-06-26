package CarranoBook.chap03;

public class SLinkListHeadRunner {
	public static void main(String args[]){
		SLinkListHead s=new SLinkListHead();
		Node n=new Node("first");
		Node n2=new Node("second");
		Node n3=new Node("third");
		s.addFirst(n);
		s.addFirst(n2);
		s.addFirst(n3);
		
		for(int c=0;c<s.getSize();c++){
			Node next=null;
			Node no=s.head;
			if(no!=null)
			next=no.getNext();
			
			if(c==0)
			System.out.println(no.getElement());
			else
			System.out.println(next.getElement());
		}
	

	}
}
