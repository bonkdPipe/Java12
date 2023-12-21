import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Card> cardPlayer1 = new LinkedList<>();
        Queue<Card> cardPlayer2 = new LinkedList<>();

        Card temp1;
        Card temp2;

        Scanner scn = new Scanner(System.in);
        String cardset1;
        String cardset2;


        do {
            cardset1 = scn.next();
            cardset2 = scn.next();
        } while (cardset2.length() > 5 && cardset1.length() > 5);

        CardMasterQueue.parseStringToCard(cardset1, cardPlayer1);
        CardMasterQueue.parseStringToCard(cardset2, cardPlayer2);


        for(int i = 0; i < 106; i++) {

            if(i == 105) {
                System.out.println("botva");
            }

            System.out.println("Round" + i + ": ");
            for (Card card : cardPlayer1) {
                System.out.print(card.getValue());
            }
            System.out.println();
            System.out.println("-------");
            for (Card card : cardPlayer2) {
                System.out.print(card.getValue());
            }
            System.out.println();

            if(!cardPlayer1.isEmpty()) {
                temp1 = cardPlayer1.remove();
            } else {
                System.out.println("Player 2 won, " + i);
                return;
            }

            if(!cardPlayer2.isEmpty()) {
                temp2 = cardPlayer2.remove();
            } else {
                System.out.println("Player 1 won, " + i);
                return;
            }

            if(temp1.getValue() < temp2.getValue()) {
                cardPlayer1.add(temp1);
                cardPlayer1.add(temp2);
            } else if (temp1.getValue() > temp2.getValue()) {
                cardPlayer2.add(temp2);
                cardPlayer2.add(temp1);
            } else {
                cardPlayer1.add(temp1);
                cardPlayer2.add(temp2);
            }

        }
    }
}
