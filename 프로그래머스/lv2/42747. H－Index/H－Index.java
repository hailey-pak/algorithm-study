import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int idx = n - i;
            if (citations[i] >= idx) {
                answer = idx;
                break;
            }
        }
        return answer;
    }
}