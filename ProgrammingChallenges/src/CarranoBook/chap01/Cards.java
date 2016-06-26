package CarranoBook.chap01;

import java.util.ArrayList;
import java.util.List;


 
  public class Cards {
	  
	  public enum RankEnum {
		  DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
		  NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(10);
		  private int Rankpoints;

		  RankEnum(int points) {
		      this.Rankpoints = points;
		  }

		  public int getRankpoints() {
		      return this.Rankpoints;
		  }
		  }

		  public enum Suit {
		      CLUBS(2), DIAMONDS(3), HEARTS(4), SPADES(1);

		      private int Suitpoints;

		      Suit(int points) {

		          this.Suitpoints = points;

		      }

		      public int getSuitpoints() {
		          return this.Suitpoints;
		      }

		  }

	    private final RankEnum rank;
	    private final Suit suit;

	    private Cards(RankEnum rank, Suit suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    public RankEnum rank() {
	        return this.rank;
	    }

	    public Suit suit() {

	        return this.suit;

	    }

	    public String toString() {
	        return rank + " of " + suit;
	    }

	    private static final List<Cards> protoDeck = new ArrayList<Cards>();

	    // Initialize prototype deck
	    static {
	        for (Suit suit : Suit.values())
	            for (RankEnum rank : RankEnum.values())
	                protoDeck.add(new Cards(rank, suit));

	    }

	    public static ArrayList<Cards> newDeck() {

	        return new ArrayList<Cards>(protoDeck); // Return copy of prototype deck
	    }

	}

