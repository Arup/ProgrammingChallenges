package basic;

import java.util.HashMap;
import java.util.Iterator;

public class PermutationString {
	
	/*
	 * find if one string is a permutation of other
	 * hint use hashMap
	 */
	
	 boolean isPermutation(String s1,String s2){
		 boolean isPermutation=false;
		 
		 HashMap<String,Integer> s1Map=new HashMap<String,Integer>();
		 HashMap<String,Integer> s2Map=new HashMap<String,Integer>();
		 
		 for(int i=0;i<s1.length();i++){
			 String v=Character.toString(s1.charAt(i));
			 if(s1Map.containsKey(v)){
				 int value=s1Map.get(s1.charAt(i));
				 value=value+1;
				 s1Map.put(v, value);
				 //(s1.charAt(i), new Integer(value));
			 }else{
				 s1Map.put(v, 1);
			 }
		 }
		 
		 
		 for(int i=0;i<s2.length();i++){
			 String v=Character.toString(s2.charAt(i));
			 if(s2Map.containsKey(v)){
				 int value=s2Map.get(s2.charAt(i));
				 value=value+1;
				 s2Map.put(v, value);
				 //(s1.charAt(i), new Integer(value));
			 }else{
				 s2Map.put(v, 1);
			 }
		 }
		 
		 int length=s1Map.size()< s2Map.size()? s1Map.size():s2Map.size();
		 Iterator iter=s2Map.keySet().iterator();
		 
		 while(iter.hasNext()){
			 if(!s1Map.containsKey(iter.next())){
				 isPermutation=false;
				 break;
			 }else{
				 isPermutation=true;
			 }
		 }
		 
		 
		return isPermutation;
		 
	 }

}
