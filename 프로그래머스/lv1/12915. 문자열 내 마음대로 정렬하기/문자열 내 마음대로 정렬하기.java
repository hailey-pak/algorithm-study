import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder(strings[i]);
            strings[i] = sb.insert(0, sb.charAt(n)).toString();
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }
}