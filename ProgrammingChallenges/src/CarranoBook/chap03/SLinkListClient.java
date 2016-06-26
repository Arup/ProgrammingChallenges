package CarranoBook.chap03;

public class SLinkListClient {
	
	public static void main(String args[]){
		SLinkedList s=new SLinkedList();
		Node n=new Node("first");
		Node n2=new Node("second");
		s.add(n);
		s.add(n2);
	
		for(int c=0;c<s.getSize();c++){
			System.out.println(s.next);
		}
		

	}

}
