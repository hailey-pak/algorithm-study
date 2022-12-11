class Solution {
    public int solution(String s) {
        int n = 0, cnt1 = 0, cnt2 = 0;
        char x = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (cnt1 == 0 && cnt2 == 0) {
                x = s.charAt(i);
            }
            if (x == s.charAt(i)) {
                cnt1++;
            } else {
                cnt2++;
            }
            if (cnt1 == cnt2) {
                n++;
                cnt1 = cnt2 = 0;
            }
        }
        if (cnt1 != 0)  n++;
        return n;
    }
}