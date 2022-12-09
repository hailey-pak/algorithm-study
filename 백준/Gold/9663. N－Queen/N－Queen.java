import java.util.Scanner;

public class Main {

    static int[] arr;
    static int N;
    static int count = 0;

    public static void main(String[] args) {
        N = new Scanner(System.in).nextInt();
        arr = new int[N];
        nQueen(0);
        System.out.println(count);
    }

    static void nQueen(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (check(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    static boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) return false;
            if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
        }
        return true;
    }
}