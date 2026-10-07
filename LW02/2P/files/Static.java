class Pizza {
    static int made = 0;
    int slices = 8;
    Pizza() { made = made + 1; }
}

public class Static {
    public static void main(String[] args) {
        Pizza a = new Pizza();
        Pizza b = new Pizza();
        a.slices = 6;
        System.out.println(a.slices + " " + b.slices);
        System.out.println(Pizza.made);
    }
}
