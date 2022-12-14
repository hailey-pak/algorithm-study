import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int n = 0;
        String answer = null;
        for (String com : completion) {
            if (com.equals(participant[n])) {
                n++;
            } else {
                answer = participant[n];
                break;
            }
        }

        return answer == null ? participant[participant.length-1] : answer;
    }
}