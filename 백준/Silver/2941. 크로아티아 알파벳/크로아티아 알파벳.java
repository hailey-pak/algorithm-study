import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("c=","c").replaceAll("c-", "c").replaceAll("dz=","d")
                .replaceAll("d-","d").replaceAll("lj", "l").replaceAll("nj","n")
                .replaceAll("s=","s").replaceAll("z=","z");
        System.out.print(str.length());
    }
}