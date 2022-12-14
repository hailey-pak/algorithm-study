import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);

            for (int j = 0; j < str[1].length(); j++) {
                for (int k = 0; k < R; k++) {
                    bw.write(str[1].charAt(j));
                }
            }
            if (i!=T-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}