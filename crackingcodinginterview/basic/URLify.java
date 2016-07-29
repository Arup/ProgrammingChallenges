package basic;

public class URLify {

	//Remove space by %20
	/*
	 * Write a method to replace all spaces in a string with '%20'. 
	 * You may assume that the string has sufficient space at the end to hold the additional characters, 
	 * and that you are given the "true" length of the string.EXAMPLE
		Input: "Mr John Smith     ", 13
		Output: "Mr%20John%20Smith"
	 */
	
	//remove trailing and begining space
	String url;
	
	void setUrl(String url){
		this.url=url;
	}
	
	String getURL(){
		return this.url;
	}
	
	 URLify(String url){
		 url=url.trim();		
		 url=url.replaceAll(" ", "%20");
		 System.out.println(url);
		
	}
	 
	 public static void main(String args[]){
		 URLify u=new URLify("Mr John Smith     ");
		 //u.setUrl("");
		// System.out.println(u.getURL());
	 }
	
	
	
}
