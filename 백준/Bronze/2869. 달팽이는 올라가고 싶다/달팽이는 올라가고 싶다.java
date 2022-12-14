import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int A = Integer.parseInt(in[0]);
        int B = Integer.parseInt(in[1]);
        int V = Integer.parseInt(in[2]);

        int n = (V-B) / (A-B);
        if ( (V-B) % (A-B) !=0 ) n++;
        System.out.print(n);
    }
}