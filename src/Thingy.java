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
}
