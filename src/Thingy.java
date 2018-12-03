public class Thingy implements Comparable <Thingy>{
    private int val;
    public Thingy(){
        this.val = Utilities.randInt(1, 10000);
    }

    public int compareTo(Thingy t){
        return this.val - t.val;
    }
    public Thingy[] randomThingArr(int num) {
        Thingy[] things = new Thingy[num];
        for (int i = 0; i < num; i++) {
            things[i] = new Thingy();
        }
        return things;
    }
}