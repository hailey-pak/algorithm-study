class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        int i = 1;
        sb.append(0);

        while (sb.length() < m * t) {
            sb.append(convert(i++, n));
        }
        for (int j = p - 1; j < m * (t - 1) + p; j += m) {
            answer.append(sb.charAt(j));
        }
        return answer.toString();
    }
    
    public String convert(int num, int n) {
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            if (num % n < 10) {
                str.insert(0, num % n);
            } else {
                str.insert(0, (char) (num % n + 55));
            }
            num /= n;
        }
        return str.toString();
    }
}