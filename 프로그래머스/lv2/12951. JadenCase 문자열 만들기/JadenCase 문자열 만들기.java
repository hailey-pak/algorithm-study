class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        boolean isFirst = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                isFirst = true;
            } else if (Character.isDigit(c)) {
                sb.append(c);
                isFirst = false;
            } else {
                if (isFirst) {
                    sb.append(String.valueOf(c).toUpperCase());
                    isFirst = false;
                } else {
                    sb.append(String.valueOf(c).toLowerCase());
                }
            }
        }

        return sb.toString();
    }
}