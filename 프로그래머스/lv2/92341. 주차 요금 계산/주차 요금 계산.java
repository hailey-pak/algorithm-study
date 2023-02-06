import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> before = new HashMap<>();
        HashMap<String, Integer> after = new HashMap<>();
        TreeSet<String> cars = new TreeSet<>();

        for (String record : records) {
            String[] str = record.split(" ");

            String car = str[1];
            cars.add(car);
            int time = Integer.parseInt(str[0].substring(0, 2)) * 60 + Integer.parseInt(str[0].substring(3, 5));

            if (str[2].equals("IN")) {
                before.put(car, time);

            } else {
                int sub = time - before.get(car);   //출차시간 - 입차시간
                after.put(car, after.getOrDefault(car, 0) + sub);   //총 이용시간 누적해서 저장
                before.remove(car);     //입-출차 끝난 차량 제거
            }
        }

        //마지막 출차가 없는 차량 23:59로 간주해서 계산
        for (String car : before.keySet()) {
            int time = 23 * 60 + 59;
            int sub = time - before.get(car);
            after.put(car, after.getOrDefault(car, 0) + sub);
        }

        //요금 계산
        int[] answer = new int[after.size()];
        ArrayList<String> carList = new ArrayList<>(cars);

        for (int i = 0; i < answer.length; i++) {
            double time = after.get(carList.get(i));  //차량번호로 총 이용 시간 가져옴

            answer[i] = fees[1];                //기본 요금 부과

            if (time >= fees[0] ) { //기본 시간보다 이용 시간이 길 때 추과 요금 부과
                time -= fees[0];
                answer[i] += (int) (Math.ceil(time / fees[2]) * fees[3]);
            }
        }

        return answer;
    }
}