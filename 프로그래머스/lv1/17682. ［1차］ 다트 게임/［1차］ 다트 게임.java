import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < dartResult.length(); i++) {
            sb.append(dartResult.charAt(i));

            char c = sb.charAt(sb.length()-1);
            if (c == 'S' || c == 'D' || c == 'T') {
                int n = Integer.parseInt(sb.substring(0, sb.length()-1));   //문자를 제외한 자리를 숫자로 변환
                n = (int) (c=='D' ? Math.pow(n,2) : c=='T' ? Math.pow(n,3) : n);
                stack.push(n);
                sb.setLength(0);    //StringBuilder 초기화
            }
            if (c == '*') {
                sb.setLength(0);
                int last = stack.pop();
                if (!stack.isEmpty()) {
                    int n = stack.pop();
                    stack.push(n * 2);
                }
                stack.push(last * 2);
            }
            if (c == '#') {
                sb.setLength(0);
                int last = stack.pop();
                stack.push(last * (-1));
            }

        }
        int ans = 0;
        while (!stack.isEmpty()){
            ans+= stack.pop();
        }
        return ans;
    }
}