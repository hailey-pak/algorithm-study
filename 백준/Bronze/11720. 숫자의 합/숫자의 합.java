import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (char c : br.readLine().toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        System.out.print(sum);
    }
}