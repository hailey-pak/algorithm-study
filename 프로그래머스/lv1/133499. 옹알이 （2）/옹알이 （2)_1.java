class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        for (String s : babbling) {
            // ^: 문자열의 시작   $: 문자열의 끝
            // (): 소괄호 안의 문자를 하나의 문자로 인식
            // | : or조건    +: 문자가 1번 이상 발생
            // X(?!Y): X 다음에 Y가 없는 경우 (같은 문자열은 한번만 올 수 있기 때문에 해당 식 적용)
            if (s.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
                cnt++;
            }
        }
        return cnt;
    }
}