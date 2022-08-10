package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        // map 만들어주기
        Map<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            // complements map에 현재 숫자가 키값으로 저장되어 있는지 확인 -- 만약 없다면 null 값 반환
            Integer complementIndex = complements.get(nums[i]);
            // 만약 현재 숫자가 map에 키값으로 저장되어 있다면, 답을 찾은 것~
            if(complementIndex != null) {
                return new int[] {i, complementIndex};
            }
            // 만약 현재 숫자가 map에 키값으로 저장되어 있지 않다면
            complements.put(target - nums[i], i);
        }

        return nums;
    }
}


// sol1 은 nested for loop으로 big o 가 O(n^2)였음
// sol2 를 Map 을 이용해서 O(n)으로 풀어보자
// [3,2,4], target = 6

// for 루프로 요소 하나씩 돌거임
// 1) 6이 나오기 위해서 3에는 3을 더해야 함
// 이 정보를 hashmap에 저장하자
// {6이 나오려면 더해야 하는 숫자 : 현재 숫자의 인덱스}
// {3 : 0}
// 근데 위에 과정 전에 hashmap에 현재 숫자가 키로 저장되어 있는지 확인하기
// {4 : 1}
// 현재 확인중인 숫자 4가 hashmap 에 키값으로 이미 저장되어 있음!
// 키값 4의 밸류값 1(2의 인덱스값)과 현재숫자 4의 인덱스값 2를 배열에 담아 리턴