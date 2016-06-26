package cahp04.projects;

public interface IRing {
	boolean add(Object item);
	boolean remove(Object item);
	boolean contains(Object item);
	void cycle();
	int numItems();
}
