package leetcode.hash.test1512;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        int[] one = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(one));
    }

    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for(int a : nums) {
            int current = count.getOrDefault(a, 0);
            // 배열의 요소를 키로 해서 count 해시맵에서 값 가져오기
            // 만약 배열 요소가 해시맵에 없으면 값을 0으로 초기화
            // 만약 배열 요소가 이미 있으면 값을 가져오기
            result += current;
            // result에 가져온 값을 더해주기
            count.put(a, current + 1);
            // 해시맵에 키 - 값으로 저장해주기
            // 이 때 해당 키가 몇변 나왔는지 표시해주기 위해서 current에 1씩 더해줌
        }
        return result;
    }
}
