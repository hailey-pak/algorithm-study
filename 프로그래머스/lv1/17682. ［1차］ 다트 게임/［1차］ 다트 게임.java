import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < dartResult.length(); i++) {
            sb.append(dartResult.charAt(i));

            char c = sb.charAt(sb.length()-1);
            if (c == 'S' || c == 'D' || c == 'T') {
                int n = Integer.parseInt(sb.substring(0, sb.length()-1));   //문자를 제외한 자리를 숫자로 변환
                n = (int) (c=='D' ? Math.pow(n,2) : c=='T' ? Math.pow(n,3) : n);
                list.add(n);
                sb.setLength(0);    //StringBuilder 초기화
            }
            if (c == '*') {
                sb.setLength(0);

                if (list.size() > 1) {
                    int n = list.get(list.size()-2);
                    list.set(list.size()-2, n * 2);
                }
                int n = list.get(list.size()-1);
                list.set(list.size()-1, n * 2);
            }
            if (c == '#') {
                sb.setLength(0);
                int n = list.get(list.size()-1);
                list.set(list.size()-1, n * (-1));
            }

        }
        int ans = 0;
        for (Integer integer : list) {
            ans += integer;
        }
        return ans;
    }
}