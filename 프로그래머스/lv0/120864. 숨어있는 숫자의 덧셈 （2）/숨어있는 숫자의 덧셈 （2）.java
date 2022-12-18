class Solution {
    public int solution(String my_string) {
        int sum = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                s.append(c);
            } else {
                if (s.toString().trim().length() != 0) {
                    sum += Integer.parseInt(s.toString());
                    s = new StringBuilder();
                }
            }
        }
        if (s.toString().trim().length() != 0) {
            sum += Integer.parseInt(s.toString());
        }
        return sum;
    }
}