package basic;

/*
 * -Assume you have a method isSubstring, which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if st1 is a rotation of s2 using only one call to 
 * isSubstring (e.g. "waterbottle" is a rotation of "erbottlewat").
 */

public class StringRotation {
	
	boolean isSubstring(String s1,String s2){
		
		if(s2.equals(reverse(s1))){
			return true;
		}else{
			return false;
		}
		
	}
	
	String reverse(String s1){
		char c[]=new char[s1.length()];
		c=s1.toCharArray();
		
		for(int i=0;i<(s1.length()/2);i++){
			char temp=c[(s1.length()-1)-i];
			c[(s1.length()-1)-i]=c[i];
			c[i]=temp;
		}
		
		return new String(c);
	}

}
