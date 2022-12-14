import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime = makePrime(123456*2+1);
        int n;
        while ((n = Integer.parseInt(br.readLine()) )!= 0) {
            int cnt = 0;
            for (int i = n+1; i <= 2*n; i++) {
                if(!prime[i]) cnt++;
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean[] makePrime(int N) {
        boolean[] prime = new boolean[N+1]; //0 ~ N
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(N) ; i++) {
            if (prime[i] == true)  continue;

            //i의 배수들을 걸러주기 위한 반복문
            for (int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
        return prime;
    }
}