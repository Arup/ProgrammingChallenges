package basic;

import java.util.ArrayList;

/*
 * -Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the sting aabcccccaaa would become a2b1c5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z).
 */

public class StringCompression {
	
	String compress(String input){
		
		ArrayList<String> aList=new ArrayList<String> ();
		
		int count=1;
		int alphaCount=1;
		StringBuffer sb=new StringBuffer();
		String OrigalphaB=Character.toString(input.charAt(0));
		String alphaB=OrigalphaB+alphaCount;
		
		while(count<input.length()){
			
			if(alphaB.equals(Character.toString(input.charAt(count)))){
				alphaCount++;
			}else{
				OrigalphaB=Character.toString(input.charAt(count));
				alphaCount=1;
			}
			//alphaB=OrigalphaB+alphaCount;
			if(!alphaB.startsWith(OrigalphaB)){
				sb.append(alphaB);
			}
		}
		
		return sb.toString();
	}
	
	

}
