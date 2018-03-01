import java.io.*;
public class Dealer {

    String name;
    Hand hand;
    int score;
    boolean lost;

    public Dealer() {
        this.name = "Dealer";
        this.hand = new Hand();
        this.score = 0;
        this.lost = false;
    }

    public void turnOverHand(Hand dealtHand) {
        hand = dealtHand;
        System.out.println("Player was dealt " + dealtHand.cards[0].rank + dealtHand.cards[0].suit);
        System.out.println("Player was dealt " + dealtHand.cards[1].rank + dealtHand.cards[0].suit);
        hand.calculateHand();
    }

    public void stand() {
        System.out.println("Dealer stands!");
        hand.calculateHand();
    }

}