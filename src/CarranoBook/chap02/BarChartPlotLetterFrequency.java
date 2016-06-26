package CarranoBook.chap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BarChartPlotLetterFrequency {
	
	void printFrequency(String filename){
		HashMap m=new HashMap();
		char c[]=new FileReadHelper().readFile(filename);
		
		for(int count=0;count<c.length;count++){
			if( m.containsKey(String.valueOf(c[count]))){
				 Integer value = (Integer) m.get(String.valueOf(c[count]));
				 value=value+1;
				m.put(String.valueOf(c[count]), new Integer (value));
			}else{
				m.put(String.valueOf(c[count]), new Integer (1));
			}
		}
		
		Iterator iter=m.entrySet().iterator();
		
		while(iter.hasNext()){
			Map.Entry pair = (Map.Entry)iter.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		
		
	}
	
	
	public static void main(String args[]){
		BarChartPlotLetterFrequency b=new BarChartPlotLetterFrequency();
		b.printFrequency("/Users/arup_kabi/Downloads/googlecloud");
	}

}
