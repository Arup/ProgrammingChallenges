package one;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedSet;

public class onedotsix {
	
	
	public static void main(String args[]){
		System.out.println("Input the values");
		Scanner sc=new Scanner(System.in);
		int lowerLimit=0;
		int upperLimit=0;
		int length;
		int target[] = null;
		int dest[] = null;
		ArrayList arr=null;
		//while(sc.hasNext()){
			lowerLimit=sc.nextInt();
			upperLimit=sc.nextInt();
		//}
		length=upperLimit-lowerLimit;
		
		target = new int[length];
		dest = new int[length];
		arr=new ArrayList(length);
		
		for(int count=0;count<length;count++){
			target[count]=count+lowerLimit;
			//dest[count] =cycleLength(target[count]);	
			arr.add(count, cycleLength(target[count]));
		}	
		
		Collections.sort(arr);
		
		if(arr.size()>1)
			System.out.println(lowerLimit+" "+upperLimit+" "+arr.get(arr.size()-1));
		else
			System.out.println(lowerLimit+" "+upperLimit+" "+arr.get(0));
		
	}
	
	static int cycleLength(int a){
		LinkedList<Integer> list = new LinkedList<Integer>();
		Integer [] arr=null;
		
		
		while(a>1){
			if(a%2==0){
				a=a/2;
				list.add(new Integer(a));
			}else{
				a=3*a+1;
				list.add(new Integer(a));
			}
			
			
		}
		/*Collections.sort(list, new Comparator<Integer>() {
	         @Override
	         public int compare(Integer o1, Integer o2) {
	             return Collator.getInstance().compare(o1, o2);
	         }
	     });*/
		
		//System.out.println();		
		//Collections.sort(list);
		//System.out.println("Sorted List is: "+list.get((list.size()-1)));
		return list.size()+1;		
		
	}

}
