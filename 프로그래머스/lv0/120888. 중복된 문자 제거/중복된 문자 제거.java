class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.charAt(0));
        for (int i = 1; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (!sb.toString().contains(c+"")) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}