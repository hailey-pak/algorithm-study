import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (b >= c) {
            System.out.print(-1);
        } else {
           int n = a / (c-b) +1;
           System.out.print(n);
        }
    }
}