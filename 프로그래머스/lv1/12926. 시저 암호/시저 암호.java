class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c += n;
                c = c > 90 ? (char) (c - 26) : c;
            }
            if (c >= 97 && c <= 122) {
                c += n;
                c = c > 122 ? (char) (c - 26) : c;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}