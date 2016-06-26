package CarranoBook.chap02;

public class ArithProgression extends Progression {
	
	protected long inc;
	
	ArithProgression(){
		this(1);
	}

	public ArithProgression(long increment) {
		// TODO Auto-generated constructor stub
		inc=increment;
	}
	
	protected long nextValue(){
		cur+=inc;
		return cur;
	}

}
