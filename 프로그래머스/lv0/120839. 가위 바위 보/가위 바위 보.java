class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            switch (rsp.charAt(i)){
                case '0':
                    answer.append('5');
                    break;
                case '2':
                    answer.append('0');
                    break;
                default:
                    answer.append('2');
            }
        }
        return answer.toString();
    }
}