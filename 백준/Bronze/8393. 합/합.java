import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(n++*n/2);
    }
}