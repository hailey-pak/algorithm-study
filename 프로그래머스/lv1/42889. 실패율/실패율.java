import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        Double[][] arr = new Double[N][2];
        Arrays.sort(stages);
        for (int i = 1; i <= N; i++) {
            int sum = 0, cnt = 0;
            for(int s : stages) {
                if (s >= i) {
                    sum++;              //해당 단계 이상 도전한 사람 수
                    if (s == i) cnt++;  //해당 단계에 머물러 있는 수
                }
            }
            arr[i-1][0] = (double)i;
            arr[i-1][1] = cnt==0 ? 0 : (double)cnt/sum;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Double.compare(o1[0], o2[0]);
            } else {
                return Double.compare(o2[1], o1[1]);
            }
        });
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = arr[i][0].intValue();
        }
        return answer;
    }
}