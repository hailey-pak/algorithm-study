import java.util.Stack;

class Solution {
    public int solution(String s) {
        int ans = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            String sub = sb.substring(0, 1);
            sb.delete(0, 1);
            sb.append(sub);

            if (check(sb.toString())) {
                ans++;
            }
        }
        return ans;
    }
    
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '[' :
                case '{' :
                case '(' :
                    stack.add(c);
                    break;
                case ']':
                    if (stack.empty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.empty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case ')':
                    if (stack.empty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}