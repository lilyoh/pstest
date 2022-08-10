package leetcode;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }

        return nums;
    }
}

// [3,2,4], target = 6
// nums 돌면서 하나 픽
// 두번째 요소부터 돌기
// 첫 요소랑 두번째 요소랑 더해서 6 나오면
// i랑 j 리턴