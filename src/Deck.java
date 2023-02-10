import java.util.*;

class Deck {
    private final int CARD_NUM = 52;
    private Queue<Card> cards = new LinkedList<>();

    Deck() {
        for (int i=0; i<4; i++) {
            cards.add(new Card("A"));
            for (int j=0; j<9; j++) {
                cards.add(new Card(j % 9 + 2 + ""));
            }
            cards.add(new Card("J"));
            cards.add(new Card("Q"));
            cards.add(new Card("K"));
        }
    }

    public Queue<Card> getCards() {
        return cards;
    }


    public void shuffle() {
        Collections.shuffle((List<Card>) getCards());
    }

    public Card getCard() {
        return getCards().poll();
    }
}
