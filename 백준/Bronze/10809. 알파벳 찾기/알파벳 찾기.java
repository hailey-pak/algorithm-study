import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        int i = 97;
        StringBuffer sb = new StringBuffer();
        while (i<123) {
           sb.append(S.indexOf(i++)+" ");
        }
        System.out.print(sb);
    }
}