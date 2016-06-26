package CarranoBook.chap02;

public class Progression {
	
	protected long first;
	protected long cur;
	
	Progression(){
		cur=first=0;
	}
	
	protected long firstValue(){
		cur=first;
		return cur;
	}
	
	protected long nextValue(){
		return ++cur;
	}
	
	protected void printProgression(int n){
		System.out.println(firstValue());
		for(int i=2;i<=n;i++){
			System.out.println(nextValue());
		}
	}

}
