class Solution {
    public int solution(int chicken) {
        int answer = 0;
        if (chicken < 10) return answer;

        do {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        } while (chicken >= 10);

        return answer;
    }
}