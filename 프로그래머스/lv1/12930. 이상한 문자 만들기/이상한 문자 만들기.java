class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (c == 32) {
                sb.append(c);
                n = 0;
            } else {
                if (n % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                n++;
            }
        }
        return sb.toString();
    }
}