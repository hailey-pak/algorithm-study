import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String before = words[0].substring(0,1);            //맨 첫글자 저장
        int cnt = 0;

        for (String w : words) {
            ++cnt;
            if (set.contains(w) || !w.startsWith(before)) {
                int num = cnt % n == 0 ? n : cnt % n;
                int turn = cnt % n == 0 ? cnt / n : cnt / n + 1;
                answer = new int[] {num, turn};
                break;

            } else {
                set.add(w);
                before = w.substring(w.length() - 1);
            }
        }
        return answer;
    }
}