class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        String[] none = {"ayaaya", "yeye", "woowoo", "mama"};
        int cnt = 0;

        for (String b : babbling) {
            boolean valid = true;
            for (String n : none) {
                if (b.contains(n)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                for (String a : arr) {
                    b = b.replace(a, " ");
                }
                if (b.trim().length() == 0) cnt++;
            }
        }
        return cnt;
    }
}