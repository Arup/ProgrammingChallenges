package CarranoBook.chap01;

import java.util.*;



public class Deal {
    public static void main(String args[]) {
        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);
        List<Cards> deck = Cards.newDeck();
        Collections.shuffle(deck);

        for (Cards card : deck) {
            System.out.println(card.rank() + " of " + card.suit() + "("
                    + card.suit().getSuitpoints() + ")" + ",");

        }

        for (int i = 0; i < numHands; i++)
            System.out.println(deal(deck, cardsPerHand));
    }

    public static ArrayList<Cards> deal(List<Cards> deck, int n) {
        int deckSize = deck.size();
        List<Cards> handView = deck.subList(deckSize - n, deckSize);
        ArrayList<Cards> hand = new ArrayList<Cards>(handView);
        handView.clear();
        return hand;
    }
}