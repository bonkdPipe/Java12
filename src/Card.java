public class Card implements Comparable<Card> {

    private Integer value;
    public Card(Integer value) {
        this.value = value - 48;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value - 48;
    }

    @Override
    public int compareTo(Card o) {
        return this.getValue().compareTo(o.getValue());
    }
}
