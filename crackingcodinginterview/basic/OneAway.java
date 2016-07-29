package basic;

import java.util.HashMap;
import java.util.Iterator;

public class OneAway {
	
	/*
	 * Three type of edits that can be done on strings
	 * insert,remove or replace a character
	 * Given 2 strings, WAF to check if one (zero edits) away
	 * eg
	 * pale, ple ->true
	 * pales,pale->true
	 * pale,bale ->true
	 * pale,bake ->false
	 */
	
	 long calculateAsciiValue(String str){
		return 0;
		 
	 }
	 
//	 boolean oneAway(String s1,String s2){
//		 
//		 long s1Asci=0;
//		 long s2Asci=0;
//		 
//		 if(s1.equals(s2)){
//			 return true;
//		 }
//		 
//	 }
	 
	 boolean oneAway(String s1,String s2){
		 int oneAway=0;
		 boolean nAway=false;
		 
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
				 oneAway=oneAway+1;
			 }
		 }
		 
		 if (oneAway>1)
			 nAway=false;
		 else
			 nAway=true;
		 
		return nAway;
		 
	 }

}
