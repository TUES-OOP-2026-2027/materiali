public class Rent {
    static int rented = 0;
    private int hours;
    int price;

    Rent(int hours) {
        this.hours = hours;
        price = hours * 3;
        rented = rented + 1;
    }

    int cost() { return price; }

    public static void main(String[] args) {
        Rent a = new Rent(2);
        Rent b = a;
        b.hours = 5;
        int[] days = {1, 2, 3};
        int[] copy = days;
        copy[0] = 9;
        String name = "bike";
        String n2 = name;
        n2 = n2 + "s";
        System.out.println(a.hours + " " + rented + " " + days[0] + " " + name);
    }
}
