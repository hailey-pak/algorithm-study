class Solution {
    public int solution(String[] babbling) {
        String[] word = new String[] {"aya", "ye", "woo", "ma"};

        int cnt = 0;
        for (String bab : babbling) {
            for (String w : word) {
                bab = bab.replace(w, " ");
            }
            if (bab.trim().length() == 0) cnt++;
        }
        return cnt;
    }
}