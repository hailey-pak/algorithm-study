class Solution {
    public int solution(String skill, String[] skill_trees) {
       int ans = 0;
        
        for (String s : skill_trees) {
            boolean b = true;
            int n = -1;

            for (int i = 0; i < s.length(); i++) {
                String w = s.charAt(i) +"";

                int idx = skill.indexOf(w);
                if (idx > -1) {
                    n++;
                    if (idx > i || idx != n) {
                        b = false;
                        break;
                    }
                }
            }
            if (b) ans++;
        }

        return ans;
    }
}