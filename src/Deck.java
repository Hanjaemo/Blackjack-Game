import java.util.ArrayList;
import java.util.Iterator;

class Deck {
    private final int CARD_NUM = 52;
    ArrayList<Card> cards = new ArrayList<>(CARD_NUM);

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
}
