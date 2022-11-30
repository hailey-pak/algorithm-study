class Solution {
    boolean solution(String s) {
        int cnt = 0;
        for (Character c : s.toCharArray()) {
            if (c == 80 || c == 112) cnt++;
            if (c == 89 || c == 121) cnt--;
        }
        return cnt == 0 ? true : false;
    }
}