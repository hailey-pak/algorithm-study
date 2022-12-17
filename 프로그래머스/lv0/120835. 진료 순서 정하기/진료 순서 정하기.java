class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            int sum = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) sum++;
            }
            answer[i] = sum;
        }
        return answer;
    }
}