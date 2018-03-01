import java.io.*;
public class Hand {

    Card[] cards;
    Object owner;
    int score;

    public Hand() {
        this.cards = new Card[2];
    }

    public void assignOwner(Object newOwner) {
        owner = newOwner;
    }

    public void addCards(Card[] newCards) {
        cards = newCards;
    }

    public void hit(Card newCard) {
        Card[] newHand = new Card[cards.length + 1];
        newHand[cards.length] = newCard;
        System.out.println(owner + " was dealt " + newCard.rank + " " + newCard.suit);
        calculateHand();
    }

    public void calculateHand() {
        System.out.println("Calculating score");
    }
}