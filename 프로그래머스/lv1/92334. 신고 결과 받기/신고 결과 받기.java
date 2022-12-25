import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //중복신고 제거
        HashSet<String> set = new HashSet<>(Arrays.asList(report));

        //신고 횟수 누적
        HashMap<String, Integer> map = new HashMap<>();
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            String s = str.split(" ")[1];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        //k번 이상 신고 된 내역 찾기
        HashMap<String, Integer> map2 = new HashMap<>();
        iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            String[] arr = str.split(" ");
            if (map.get(arr[1]) >= k) {
                map2.put(arr[0], map2.getOrDefault(arr[0], 0) + 1);
            }
        }

        //마지막 카운팅
        int[] ans = new int[id_list.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map2.getOrDefault(id_list[i], 0);
        }
        return ans;
    }
}