import java.util.Scanner;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int k = (int) (Math.pow(2, n) - 1);
        sb.append(k + "\n");
        hanoi(n, 1, 2, 3);
        System.out.println(sb.toString());
    }

    public static void hanoi(int n, int a, int b, int c) {

        if (n == 1) {
            sb.append(a).append(" ").append(c).append("\n");
            return;
        }

        //n-1개 원판을 a->b로 이동
        hanoi(n-1, a, c, b);

        //가장 밑의 원판을 a->c로 이동
        sb.append(a).append(" ").append(c).append("\n");

        //n-1개의 원판을 b->c로 이동
        hanoi(n-1, b, a, c);
    }
}