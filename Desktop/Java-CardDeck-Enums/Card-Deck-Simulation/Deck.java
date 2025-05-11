import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<String> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Card rank : Card.values()) {
                cards.add(rank + " of " + suit);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return "No cards left in the deck.";
    }

    public void printDeck() {
        for (String card : cards) {
            System.out.println(card);
        }
    }
}
