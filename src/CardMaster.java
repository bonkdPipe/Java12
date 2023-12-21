import java.util.Vector;

public class CardMaster {
    public static void parseStringToCard(String toParse,Vector<Card> toFill) {
        for (int i = 0; i < 5; i++) {
            toFill.add(new Card((int) toParse.charAt(i)));
        }
    }

}
