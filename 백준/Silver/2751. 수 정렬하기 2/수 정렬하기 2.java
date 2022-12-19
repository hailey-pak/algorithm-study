import java.io.*;

public class Main {
    public static int[] sorted;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sorted = new int[n];
        sort(arr, 0, arr.length - 1);    //병합정렬

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static void sort(int[] a, int left, int right) {
        for (int size = 1; size <= right; size += size) {
            for (int i = 0; i <= right - size; i += (2 * size)) {
                int low = i;
                int mid = i + size - 1;
                int high = Math.min(i + (2 * size) - 1, right);
                merge(a, low, mid, high);
            }
        }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid || r <= right) {
            if (r > right || (l <= mid && a[l] < a[r])) {
                sorted[idx++] = a[l++];
            } else {
                sorted[idx++] = a[r++];
            }
        }

        if (right + 1 - left >= 0) System.arraycopy(sorted, left, a, left, right + 1 - left);
    }
}