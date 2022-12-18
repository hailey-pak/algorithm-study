class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int ans;

            if (str[1].equals("+")){
                ans = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
            } else {
                ans = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            }
            answer[i] = ans == Integer.parseInt(str[4]) ? "O" : "X";
        }
        return answer;
    }
}