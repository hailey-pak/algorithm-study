class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 3);
            n = n / 3;
        }

        String s = sb.toString();
        return Integer.parseInt(s, 3);
    }
}