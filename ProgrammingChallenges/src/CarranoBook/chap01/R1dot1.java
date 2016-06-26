package CarranoBook.chap01;

public class R1dot1 {

	static GameEntry A[];
	static GameEntry B[];
	
	public static void main(String args[]){
		
		A =new GameEntry [6];
		B =new GameEntry [6];
		
		for (int i=0;i<6;i++){
			A[i]=new GameEntry();
			B[i]=new GameEntry();
			
			System.out.println("A"+i+ "value is" +A[i]);
			System.out.println("B"+i+ "value is" +B[i]);
		}
		
		A[4].scores=50;
		B=A.clone();
		
		System.out.println("The value of B[4] is----"+B[4].getScores());
		
	}
	
}


class GameEntry{
	int scores;

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}
}