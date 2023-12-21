import java.util.Queue;
import java.util.Vector;

public class CardMasterQueue {
    public static void parseStringToCard(String toParse, Queue<Card> toFill) {
        for (int i = 0; i < 5; i++) {
            toFill.add(new Card((int) toParse.charAt(i)));
        }
    }

}
