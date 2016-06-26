package practice;

public enum Rank {
	
	ACE("s"),TWO("two"),THREE("three"),FOUR("four"),FIVE("five"),SIX("six"),
	SEVEN("seven"),EIGHT("eight"),NINE("nine"),TEN("ten"),JACK("jack"),QUEEN("queen"),KING("king");
	
	private final String rankno;
	private boolean faceCard;
	
	public void setFaceCard(boolean faceCard) {
		this.faceCard = faceCard;
	}

	Rank(String ranknum){
		this.rankno=ranknum;		
	}
	
	public String getRankNo(){
		return rankno;
	}
	
	boolean isFaceCard(){
		faceCard=false;
		if(this.getRankNo().equals(ACE)||this.getRankNo().equals(JACK)||this.getRankNo().equals(QUEEN)||this.getRankNo().equals(KING))
			faceCard= true;
		return faceCard;
	}
	

}
