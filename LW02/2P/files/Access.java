class Counter {
    private int count = 0;
    public void add() { count = count + 1; }
    public int get() { return count; }
}

public class Access {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.add();
        c.add();
        System.out.println(c.get());
        c.count = 10;
    }
}
