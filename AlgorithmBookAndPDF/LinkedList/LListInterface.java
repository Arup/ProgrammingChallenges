package LinkedList;
import  LinkedList.myImpl.Node;

public interface LListInterface {

	public <T> boolean add(T e);

	public <T> boolean add(int index, T element);

	public void clear();

	public <T> boolean contains(T element) ;

	public Node getNodeAtIndex(int index);

	public <T> int indexOf(T element);

	public <T> boolean remove(T element);

	public boolean remove(int index) ;
	
	public <T> T replace(int index, T element);

	public int size();


}
