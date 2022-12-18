class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[len % n == 0 ? len / n : len / n + 1];

        int s = 0, e = n;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_str.substring(s, e);
            s = e;
            e += n;
            if (e > len) e = len;
        }
        return answer;
    }
}