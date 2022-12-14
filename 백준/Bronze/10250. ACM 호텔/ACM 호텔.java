import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] in = br.readLine().split(" ");
            int H = Integer.parseInt(in[0]);
            int N = Integer.parseInt(in[2]) -1;

            bw.write((N%H+1)*100 + (N/H+1) +"\n");
        }
        bw.flush();
        bw.close();
    }
}