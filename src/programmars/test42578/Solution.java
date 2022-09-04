package programmars.test42578;

import java.util.HashMap;

public class Solution {
    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            if(map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 2);
            }
        }

        for(int count : map.values()) {
            answer *= count;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"crow_mask", "pants"}, {"blue_sunglasses", "face"},{"smoky_makeup", "face"}};

        solution(clothes);

    }
}
