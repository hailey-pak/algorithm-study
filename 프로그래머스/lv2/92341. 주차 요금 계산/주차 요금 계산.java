import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String record : records) {
            String[] str = record.split(" ");

            String car = str[1];
            int time = Integer.parseInt(str[0].substring(0, 2)) * 60 + Integer.parseInt(str[0].substring(3, 5));
            if (str[2].equals("IN")) {
                time = time * -1;
            }

            map.put(car, map.getOrDefault(car, 0) + time);   //총 이용시간 누적해서 저장
        }

        //요금 계산
        int[] answer = new int[map.size()];
        int i = 0;

        for (String car : map.keySet()) {
            int time = map.get(car);
            if (time < 1) time += 23 * 60 + 59;     //입차시간만 있으면 시간이 음수이므로 23:59분 더해줌

            answer[i] = fees[1];                    //기본 요금 부과
            if (time >= fees[0] ) {                 //기본 시간보다 이용 시간이 길 때 추과 요금 부과
                time -= fees[0];
                answer[i] += (int) (Math.ceil((double)time / fees[2]) * fees[3]);
            }
            i++;
        }
        return answer;
    }
}