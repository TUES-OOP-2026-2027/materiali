public class Arrays1 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = a;
        b[0] = 9;
        b[1] = b[0] + 1;
        System.out.println(a[0] + a[1]);
        System.out.println(b.length);
    }
}
