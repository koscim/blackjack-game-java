import java.io.*;
public class Player {

    String name;
    Hand hand;
    int score;
    boolean lost;

    public Player() {
        this.name = "Player";
        this.hand = new Hand();
        this.score = 0;
        this.lost = false;
    }

    public void pickUpHand(Hand dealtHand) {
        hand = dealtHand;
        System.out.println("Player was dealt " + dealtHand.cards[0].rank + " " + dealtHand.cards[0].suit);
        System.out.println("Player was dealt " + dealtHand.cards[1].rank + " " + dealtHand.cards[1].suit);
        hand.calculateHand();
    }

    public void stand() {
        System.out.println("Player Stands!");
        hand.calculateHand();
    }
}