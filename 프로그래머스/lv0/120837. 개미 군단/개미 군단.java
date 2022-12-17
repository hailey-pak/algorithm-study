class Solution {
    public int solution(int hp) {
        int cnt = 0;
        if (hp / 5 > 0) {
            cnt += hp / 5;
            hp = hp % 5;
        }
        if (hp / 3 > 0) {
            cnt += hp / 3;
            hp = hp % 3;
        }
        if (hp > 0) {
            cnt += hp;
        }
        return cnt;
    }
}