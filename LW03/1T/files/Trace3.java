public class Trace3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 20;
        int t = a[0] + a[1];
        System.out.println(t + " " + a.length);
    }
}
