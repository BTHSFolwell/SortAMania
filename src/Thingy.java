public class Thingy implements Comparable<Thingy>{
    private int value;
    public Thingy()
    {
        this.value = (int)(Math.random()*10000);
    }

    @Override
    public int compareTo(Thingy other)
    {
        return this.value - other.value;
    }

    public Thingy[] randomThingArr(int num)
    {
        Thingy[] things = new Thingy[num];
        for (int i = 0; i < num; i++)
        {
            things[i] = new Thingy();
        }
        return things;
    }
}
