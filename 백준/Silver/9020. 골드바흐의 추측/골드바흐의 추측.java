import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        boolean[] prime = makePrime(10001);

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
           
            int a = n / 2, b = n / 2;
            while (true) {
                //나누기 2를 한 값에서 똑같이 -1 +1 씩 하면 합은 유지되니까 둘다 소수인 값만 찾으면 됨
                if (!prime[a] && !prime[b]) {
                    bw.write(a + " " + b + "\n");
                    break;
                }
                a--;
                b++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean[] makePrime(int N) {
        boolean[] prime = new boolean[N+1]; //0 ~ N
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(N) ; i++) {
            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
        return prime;
    }
}