package leetcode.hash.test1512;

public class Main {
    public static void main(String[] args) {
        int[] one = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(one));
    }
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    result += 1;
                }
            }
        }

        return result;
    }
}
