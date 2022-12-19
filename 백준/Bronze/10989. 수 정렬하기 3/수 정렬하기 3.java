import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        int[] sorted = new int[n];
        int[] counting = new int[max+1];
        
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            counting[val]--;
            sorted[counting[val]] = val;
        }
        for (int i : sorted) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}