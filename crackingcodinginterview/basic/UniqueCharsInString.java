package basic;

import java.util.HashSet;

public class UniqueCharsInString {
	
	public static boolean checkForUnique(String str){
		
		HashSet s=new HashSet();
		int count=0;
		boolean value=false;
		
		while(count<str.length()){
		if(s.contains(str.charAt(count))){
			return false;
		}else{
			s.add(str.charAt(count));
			value=true;
		}
		count++;
		
	}
		return value;
}
	
	public static void main(String args[]){
	String s1="animus";
	String s2="animal";
	System.out.println(checkForUnique(s1));
	System.out.println(checkForUnique(s2));
	}

}
