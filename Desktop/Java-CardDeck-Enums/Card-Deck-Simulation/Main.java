public class Main {
  public static void main(String[] args) {
      Deck deck = new Deck();
      System.out.println("Original deck:");
      deck.printDeck();

      deck.shuffle();
      System.out.println("\nShuffled deck:");
      deck.printDeck();

      System.out.println("\nDealing a card: " + deck.dealCard());
  }
}
