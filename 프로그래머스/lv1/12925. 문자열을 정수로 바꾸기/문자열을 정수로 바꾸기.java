class Solution {
    public int solution(String s) {
        int answer;
        if (s.contains("-")) {
            answer = Integer.parseInt(s.substring(1)) * -1;
        } else if (s.contains("+")) {
            answer = Integer.parseInt(s.substring(1));
        } else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}