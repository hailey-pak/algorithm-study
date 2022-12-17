class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            int k = i;
            if (i == num1) {
                k = num2;
            } else if (i == num2) {
                k = num1;
            }
            sb.append(my_string.charAt(k));
        }
        return sb.toString();
    }
}