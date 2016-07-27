package chap01;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class threeNPlus1 {
	Stack st;
	
	public static void main(String args[]) throws Exception{
		int fis=0,sec=0;
		Map numMap=new LinkedHashMap();
		int cycleLength=0;
		if(args.length==2){
			fis=Integer.parseInt(args[0]);
			sec=Integer.parseInt(args[1]);
		}else{
			throw new Exception ("Inputs are not correct");
		}
		
		for (int count=fis;count<=sec;count++){
			 cycleLength=findCycleLength(count);
			numMap.put(new Integer(count),new Integer(cycleLength));
			System.out.println( numMap.get(new Integer(count)));
		}
		
		numMap=sortByValue(numMap);
		

		
		System.out.println(fis+" "+sec+" "+numMap.get(new Integer(sec)));
			
	}
	
	
	
	static int findCycleLength(int num){
		int count=0;
		while (num > 1){
			if(num%2==0){
				num=num/2;
				
			}else{
				num=3*(num)+1;
				
			}
			count++;
		}
		return count;
	}
	
	
	public static <K, V extends Comparable<? super V>> Map<K, V> 
    sortByValue( Map<K, V> map )
{
    List<Map.Entry<K, V>> list =
        new LinkedList<Map.Entry<K, V>>( map.entrySet() );
    Collections.sort( list, new Comparator<Map.Entry<K, V>>()
    {
        public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
        {
            return (o1.getValue()).compareTo( o2.getValue() );
        }
    } );

    Map<K, V> result = new LinkedHashMap<K, V>();
    for (Map.Entry<K, V> entry : list)
    {
        result.put( entry.getKey(), entry.getValue() );
    }
    return result;


	

}
}
