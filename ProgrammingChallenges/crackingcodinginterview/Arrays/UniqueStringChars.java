package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class UniqueStringChars {
	static int CharToASCII(char c){
		  int j = (int) c;		 
		  return j;
		  }
	char ASCIIToChar(int ascii){
		char character = (char)ascii;
		return character;
	}
	
	 boolean findDuplicates(String str){
		boolean isDup=false;
		char[] ch = null;
		int s[] = null;
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++){
			s[i]=CharToASCII(ch[i]);
		}
		
		for(int i=0;i<str.length();i++){
			list.add(new Integer(s[i]));
		}
		
		Collections.sort(list);
		
		for(Integer c : list){
			if(map.get(c) != null){
				isDup=true;
				break;
				//map.put(new String(), value)
			}
			
		}
		
		return isDup;
		
		
	}
}
