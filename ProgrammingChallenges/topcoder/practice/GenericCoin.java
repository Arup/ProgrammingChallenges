package practice;

import java.util.Random;

public class GenericCoin {
	private boolean headSide;
	public boolean isHeadSide() {
		return headSide;
	}

	public void setHeadSide(boolean headSide) {
		this.headSide = headSide;
	}

	public boolean isTailSide() {
		return tailSide;
	}

	public void setTailSide(boolean tailSide) {
		this.tailSide = tailSide;
	}

	private boolean tailSide;
	
	void toss(){
		Random rand=new Random();
		if(rand.nextInt(9)<5){
			this.setHeadSide(true);
		}else{
			this.setTailSide(true);
		}
	}

}
