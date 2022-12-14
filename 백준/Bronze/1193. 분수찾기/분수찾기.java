import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        int n = 0, sum = 0;
        while (sum < x) {
            sum += ++n;
        }

        int k = x - (sum - n);
        if (n % 2 == 0) {
            System.out.print(k + "/" + (n - k + 1));
        } else {
            System.out.print((n - k + 1) + "/" + k);
        }
    }
}