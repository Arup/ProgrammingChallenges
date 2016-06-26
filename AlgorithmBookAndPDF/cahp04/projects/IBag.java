package cahp04.projects;

public interface IBag {
boolean add(Object item);
boolean remove(Object item);
boolean contains(Object item);
int numItems();
Object grab();
Object[] toArray();
}