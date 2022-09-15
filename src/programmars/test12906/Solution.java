package programmars.test12906;

import java.util.*;

public class Solution {
    public static int[] solution(int []arr) {

        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;

    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        solution(arr);
    }
}
