class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            String s = String.valueOf(my_string.charAt(i));
            answer.append(s.repeat(n));
        }
        return answer.toString();
    }
}