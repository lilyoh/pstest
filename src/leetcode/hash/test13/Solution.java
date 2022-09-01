package leetcode.hash.test13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {

        HashMap<String, Integer> map = new HashMap<>(Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000));
        HashMap<String, HashSet<String>> check = new HashMap<>(Map.of(
                "I", new HashSet<>(Arrays.asList("V", "X")),
                "X", new HashSet<>(Arrays.asList("L", "C")),
                "C", new HashSet<>(Arrays.asList("D", "M"))
        ));

        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            String currentRoman = Character.toString(s.charAt(i));
            int currentInt = map.get(currentRoman);

            if (i + 1 != s.length()) {
                String nextRoman = Character.toString(s.charAt(i + 1));

                if (check.containsKey(currentRoman) && check.get(currentRoman).contains(nextRoman)) {
                    result -= currentInt;
                } else {
                    result += currentInt;
                }
            } else {
                result += currentInt;
            }
        }

        return result;
    }
}
