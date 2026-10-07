public class Static2 {
    int slices = 8;
    static int made = 0;
    void eat() { slices = slices - 1; }
    static void bake() {
        made = made + 1;
        slices = 8;
    }
    public static void main(String[] args) {
        bake();
        eat();
        System.out.println(made + " " + slices);
    }
}
