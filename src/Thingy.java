public class Thingy implements Comparable <Thingy>{
    int val;
    public Thingy(){
        val = Utilities.randInt(1, 10000);
    }
    public int compareTo(Thingy t){
        if(this.val > t.val){
            return 1;
        }else if(this.val < t.val){
            return -1;
        }else{
            return 0;
        }
    }
    public Thingy[] randomThingArr(int num) {
        Thingy[] things = new Thingy[num];
        for (int i = 0; i < num; i++) {
            things[i] = new Thingy();
        }
        return things;
    }
}
