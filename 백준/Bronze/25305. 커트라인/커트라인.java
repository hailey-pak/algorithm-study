import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        String[] str2 = br.readLine().split(" ");
        Integer[] x = new Integer[str2.length];
        for (int i = 0; i < str2.length; i++) {
            x[i] = Integer.valueOf(str2[i]);
        }
        Arrays.sort(x, Collections.reverseOrder());
        
        bw.write(String.valueOf(x[k-1]));
        bw.flush();
        bw.close();
        br.close();
    }
}