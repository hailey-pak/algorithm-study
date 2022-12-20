import java.io.*;

public class Main {
    static int[] A, tmp;
    static int cnt = 0;
    static int result = -1;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        k = Integer.parseInt(in[1]);

        A = new int[n];
        tmp = new int[n];

        in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(in[i]);
        }

        merge_sort(A, 0, n-1);
        System.out.print(result);
        br.close();

    }
    
    public static void merge_sort(int[] A, int p, int r){
        if (cnt > k) return;
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q+1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int A[], int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        i = p;
        t = 0;
        while (i <= r) {
            cnt++;
            if (cnt == k) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
}