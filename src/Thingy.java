public class Thingy implements Comparable<Thingy> {
    private int num;

    public Thingy() {
        this.num = (int)(Math.random() * 1000);
    }

    public int compareTo(Thingy t) {
        return this.num - t.num;
    }
}