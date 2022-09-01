package leetcode.hash.test1365;
import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] copy = nums.clone();
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();

        int smaller = 0;
        for(int i : copy) {
            if(!map.containsKey(i)) {
                map.put(i, smaller);
            }
            smaller++;
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }

        return nums;
    }
}
