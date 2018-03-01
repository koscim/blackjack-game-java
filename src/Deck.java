import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Deck {

    Card[] collection;
    String[] SUITS = new String[] {"♠️", "♦️", "♣️", "♥️"};
    String[] RANKS = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Deck() {
        this.collection = new Card[52];
        int cardCount = 0;
        for(String suit : SUITS) {
            for(String rank : RANKS) {
                this.collection[cardCount] = new Card(rank, suit);
                System.out.println("Rank: " + this.collection[cardCount].rank + " Suit: " + this.collection[cardCount].suit);
                cardCount++;
            }
        }
        System.out.println("New Deck");
        List<Card> list = Arrays.asList(this.collection);
        Collections.shuffle(list);
        list.toArray(this.collection);
    }

    public Card drawCard() {
        Card drawnCard = new Card(collection[collection.length - 1].rank, collection[collection.length - 1].suit);
        List<Card> list = new ArrayList<>(Arrays.asList(this.collection));
        list.remove(list.size() - 1);
        collection = list.toArray(new Card[list.size()]);
        System.out.println(collection.length);
        return drawnCard;
    }

    public Card[] dealHand() {
        Card[] cards = new Card[2];
        for (int i = 0; i < 2; i++) {
            cards[i] = drawCard();
        }
        return cards;
    }

}