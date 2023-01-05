import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int cnt = 0, idx = 0;
        Arrays.sort(people);

        for (int i = people.length - 1; i >= idx; i--) {
            cnt++;
            if (people[i] + people[idx] <= limit) {
                idx++;
            }
        }
        return cnt;
    }
}