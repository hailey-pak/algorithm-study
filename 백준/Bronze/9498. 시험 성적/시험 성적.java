import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		br.close();

		String gr = "F";
		if (in>=90) {
			gr = "A";
		} else if (in>=80 && in<90) {
			gr = "B";
		} else if (in>=70 && in<80) {
			gr = "C";
		} else if (in>=60 && in<70) {
			gr = "D";
		}
		System.out.print(gr);
	}
}