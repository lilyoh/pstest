package programmars.test42576;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] participant = {"a", "b", "c", "c"};
        String[] completion = {"a", "b", "c"};
        System.out.println(solution(participant, completion));

    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        String answer = "";

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }


        return answer;
    }
}

