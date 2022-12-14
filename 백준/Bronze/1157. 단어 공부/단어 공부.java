public class Main {
    public static void main(String[] args) throws Exception {
        int[] a = new int[26];
        int c, max = 0, maxa = -2;

        while ( (c = System.in.read()) > 64) {
            a[c -= c < 96 ? 65 : 97]++;

            if (max < a[c]) {
                max = a[c];
                maxa = c;
            } else if (max == a[c]) {
                maxa = -2;
            }
        }
        System.out.print((char)(maxa + 65));
    }
}