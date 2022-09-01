package leetcode.hash.test771;

import java.util.*;

class Solution {
    public static int numJewelsInStones(String jewels, String stones) {

        // 주얼리 스트링을 받아 중복없는 해시셋으로 만들기
        // 스톤 스트링을 받아 만약에 주얼리 해시셋에 스톤 char array에 있으면 count올려주기

        Set<Character> jewelSet = new HashSet<>();
        for(char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        int count = 0;
        for(char c : stones.toCharArray()) {
            if(jewelSet.contains(c)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}