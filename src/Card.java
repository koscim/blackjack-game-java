import java.io.*;
import java.util.Arrays;
import java.util.List;
public class Card {

    String rank;
    String suit;
    int value;

    // This is the constructor of the class Card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        if(isFaceCard() == true) {
            value = 10;
        } else if(isAce() == true) {
            value = 11;
        } else {
            value = Integer.parseInt(rank);
        }
    }

    private boolean isFaceCard() {
        String[] faceCards = new String[] {"J", "Q", "K"};
        List<String> list = Arrays.asList(faceCards);
        if(list.contains(rank)) {
            return true;
        }
        return false;
    }

    private boolean isAce() {
        String ace = "A";
        if(rank == ace) {
            return true;
        }
        return false;
    }

    public static void main(String []args) {
        Card firstCard = new Card("2", "hearts");

        System.out.println("Card Rank: " + firstCard.rank);
        System.out.println("Card Suit: " + firstCard.suit);
        System.out.println("Card Value: " + firstCard.value);

        Card secondCard = new Card("J", "clubs");

        System.out.println("Card Rank: " + secondCard.rank);
        System.out.println("Card Suit: " + secondCard.suit);
        System.out.println("Card Value: " + secondCard.value);

        Card thirdCard = new Card("A", "spades");

        System.out.println("Card Rank: " + thirdCard.rank);
        System.out.println("Card Suit: " + thirdCard.suit);
        System.out.println("Card Value: " + thirdCard.value);
    }
}