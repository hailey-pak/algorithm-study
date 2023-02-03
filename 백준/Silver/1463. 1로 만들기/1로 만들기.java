import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(cal(N, 0));
    }

    static int cal(int x, int cnt) {
        if (x < 2) {
            return cnt;
        }
        return Math.min(cal(x / 2, cnt + 1 + (x % 2)), cal(x / 3, cnt + 1 + (x % 3)));
    }
}