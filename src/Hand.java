import java.io.*;
public class Hand {

    Card[] cards;
    Object owner;
    int score;

    public Hand() {
        this.cards = new Card[2];
    }

    public void assignOwner(Object newOwner) {
        this.owner = newOwner;
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
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].rank == "J" || cards[i].rank == "Q" || cards[i].rank == "K") {
                score += 10;
            } else if (cards[i].rank == "A") {
                score += cards[i].value;
                if (score > 21) {
                    cards[i].value = 1;
                    score -= 10;
                }
            } else {
                score += cards[i].value;
            }
            if (score > 21) {
                for (int j = 0; j < cards.length; j++) {
                    if (cards[j].rank == "A" && cards[j].value == 11) {
                        cards[j].value = 1;
                        score -= 10;
                    }
                }
            }
            System.out.println(owner + " Score: " + score);
            if (score > 21) {
                System.out.println("Bust! " + owner + "loses...");
//                owner.lost = true;
            }
        }
    }
}