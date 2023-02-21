class Solution {
    public int solution(String word) {
        String str = "AEIOU";
        int[] arr = {781, 156, 31, 6, 1};

        int answer = word.length();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            answer += arr[i] * str.indexOf(c);
        }

        return answer;
    }
}