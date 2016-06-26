package cahp04.projects;

import java.util.Iterator;

public class BagImpl implements IBag {
	//remove and few other not implemented
	
	private Object[] items;
	private int numItems;
	public int getNumItems() {
		return numItems;
	}
	

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public static final int DEFAULT_MAX_SIZE = 50;
	private static final Object DEFAULT = null;

	
	public BagImpl() {
		items = new Object[DEFAULT_MAX_SIZE];
		numItems = 0;
	}

	public BagImpl(int maxSize) {
		if (maxSize <= 0)
			throw new IllegalArgumentException("maxSize must be > 0");
		items = new Object[maxSize];
		numItems = 0;
	}
	
	@Override
	public boolean add(Object item) {
		
		if (item == null)
			throw new IllegalArgumentException();
		
		if (numItems == items.length)
			return false; // no more room!
		else {
			items[numItems] = item;
			numItems++;
			return true;
		}

	}

	@Override
	public boolean remove(Object item) {
		// TODO Auto-generated method stub
		int position;
		if (item == null)
			throw new IllegalArgumentException();
		
		if(!contains(item))
			return false;
		else{
			position=findIndex(item);
			if(position==items.length-1){
				items[position]=putDefault(position);
			}else{
				shiftLeft(position);
			}
		}
		
		return false;
	}

	private void shiftLeft(int position) {
//		int countOfLeftShift = 0;
//		countOfLeftShift = (items.length - 1) - position;
		for (int count=position; count > 0; count--) {
			items[count]=items[count+1];
		}
		
	}

	@Override
	public boolean contains(Object item) {
		boolean isContains=false;
		for (int i = 0; i < numItems; i++) {
			if (items[i] != null && items[i].equals(item)){
				isContains= true;
				break;
			}
			else
				isContains= false;
		}
		return isContains;

	}

	@Override
	public int numItems() {
		return numItems;
	}
	
	public int incrementItemCount(){
		numItems=numItems+1;
		return numItems;
		
	}
	
	private int findIndex(Object item){
		int keyPosition = 0;
	
		for (int i = 0; i < numItems; i++) {
			if (items[i] != null && items[i].equals(item)){
				keyPosition=i;
			}
		}
		return keyPosition;
	}

	@Override
	public Object grab() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void replace(Object item,int index){
		items[index]=item;		
	}
	
	private void replace(Object item){
		int position=findIndex(item);
		replace(item,position);
	}
	
	private Object putDefault(int position){
		return items[position]=DEFAULT;
	}
	



}
