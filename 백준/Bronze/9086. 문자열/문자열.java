import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            bw.write(s.charAt(0));
            bw.write(s.charAt(s.length()-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}