import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        if (x[0] == x[1]) sb.append(x[2]);
        if (x[0] == x[2]) sb.append(x[1]);
        if (x[1] == x[2]) sb.append(x[0]);
        sb.append(" ");
        if (y[0] == y[1]) sb.append(y[2]);
        if (y[0] == y[2]) sb.append(y[1]);
        if (y[1] == y[2]) sb.append(y[0]);
        System.out.print(sb);
    }
}