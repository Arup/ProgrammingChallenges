package CarranoBook.chap03;

public class SLinkedList {
	
	
	public SLinkedList(Node next, long size) {
		this.next = next;
		this.size = size;
	}
	
	public SLinkedList() {
		this(null,0);
	}
	
	public SLinkedList(Node head) {
		this(head,1);
	}
	
	protected Node next;
	protected long size;
	
	// appends the specified element to the end of this list.
		public void add(Node data) {
	 
			// Initialize Node only incase of 1st element

			if(this.getSize()==0){
				new SLinkedList(next);
				//this.head.setNext(null);
				incrementSize();
			}else{
				while(this.next.getNext()==null){
					this.next.setNext(data);
					incrementSize();
				}
			}

	 
			// Let's check for NPE before iterate over crunchifyCurrent

	 
				// starting at the head node, crawl to the end of the list and then add element after last node
	
	 
				// the last node's "next" reference set to our new node

	 
			// increment the number of elements variable

		}
	 
		public long getSize() {
			return size;
		}
	 
		private void incrementSize() {
			size++;
		}
	 
		private void decrementSize() {
			size--;
		}
	 
		// inserts the specified element at the specified position in this list
		public void add(Object data, int index) {
	
	 
			// Let's check for NPE before iterate over crunchifyCurrent
			
				// crawl to the requested index or the last element in the list, whichever comes first
	
	 
			// set the new node's next-node reference to this node's next-node reference
			
	 
			// now set this node's next-node reference to the new node
			
	 
			// increment the number of elements variable
			
		}
	 
		//public Object get(int index)
		// returns the element at the specified position in this list.
		{
			// index must be 1 or higher

	 
		}
	 
		// removes the element at the specified position in this list.
		public void remove(int index) {
	 
			// if the index is out of range, exit

		}
	 
		// returns the number of elements in this list.
		public long size() {
			return getSize();
		}
	 
		public String toString() {
			return null;
		}

}
