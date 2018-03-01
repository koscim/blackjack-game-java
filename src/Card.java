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
        Player player = new Player();
        Deck deck = new Deck();

        Hand playerHand = new Hand();

        playerHand.addCards(deck.dealHand());
        playerHand.assignOwner(player);
        player.pickUpHand(playerHand);

//
//        Card[] playerOneHand = deck.dealHand();
//        for(int i = 0; i < playerOneHand.length; i++) {
//            System.out.println(playerOneHand[i].rank + " " + playerOneHand[i].suit);
//        }
    }
}