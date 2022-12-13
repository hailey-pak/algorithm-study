import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= x; i++) {
            if ( chkNumber(i) ) n++;
        }
        System.out.print(n);
    }

    public static boolean chkNumber(int n) {
        if (n<100) return true;
        if (n==1000) return false;

        int a = n%10;
        n = n/10;
        int b = n%10;
        int c = n/10;

        if (a-b == b-c) {
            return true;
        } else {
            return false;
        }
    }
}