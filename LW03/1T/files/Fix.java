class Ticket {
    private int price = 10;
    static int sold = 0;
    public int price() { return price; }
    void sell() { sold = sold + 1; }
}
public class Fix {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = a;
        b[0] = 9;
        Ticket t = new Ticket();
        Ticket u = t;
        t.price = 12;
        Ticket.sell();
        System.out.println(a[0] + " " + a[2]);
        System.out.println(Ticket.sold + " " + u.price());
    }
}
