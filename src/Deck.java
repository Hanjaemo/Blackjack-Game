import java.util.ArrayList;
import java.util.Collections;

class Deck {
    private final int CARD_NUM = 52;
    private ArrayList<Card> cards = new ArrayList<>(CARD_NUM);

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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(getCards());
    }

    public Card getCard() {
        return getCards().get(0);
    }
}
