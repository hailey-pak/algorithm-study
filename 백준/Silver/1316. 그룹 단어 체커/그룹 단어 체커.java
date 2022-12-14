import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (check(word))cnt++;
        }
        System.out.print(cnt);
    }

    private static boolean check(String word) {
        boolean[] chk = new boolean[26];
        int prev = 0;

        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);

            if (prev != now) {
                if (!chk[now - 'a']) {
                    chk[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}