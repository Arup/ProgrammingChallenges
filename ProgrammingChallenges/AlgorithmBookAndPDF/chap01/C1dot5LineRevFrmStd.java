package chap01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class C1dot5LineRevFrmStd {
	
	
	public static void main(String args[]){
		ArrayList<String> lines=new ArrayList();
		lines.add("First line");
		lines.add("Second line");
		lines.add("Third line");
		
		Iterator iter=(Iterator) lines.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		Collections.reverse(lines);
		
		iter=(Iterator) lines.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		//reverse(lines);
		
	}
	
	public void setName(String name){
		
	}

	private static void reverse(List lines) {
		// TODO Auto-generated method stub
//		for(int count=0;count<lines.size();count++){
//			String s=new String();
//			lines.get(count)=
//		}
		
	}

}
