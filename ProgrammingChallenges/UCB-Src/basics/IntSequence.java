package basics;

public class IntSequence {
    // instance variables
    private int [ ] myValues; // sequence elements
    int myCount;  // number of array cells used by the sequence

    // Constructor; the argument will be the actual size
    // of the array, or equivalently, the (temporary) maximum
    // number of elements it can hold.
    public IntSequence (int capacity) {
    	myValues=new int[capacity];
    	myCount=capacity;
    }

    // more methods would go here
    public boolean isEmpty ( ){
    	if(myCount>0){
    		return false;
    	}else{
    		return true;
    	}
    }
    
    public int size ( ){
    	return this.myCount;
    }
}