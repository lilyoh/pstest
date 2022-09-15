package programmars.test42747;

import java.util.Arrays;

class Solution {
    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int el = citations[i];
            System.out.println(el);
            System.out.println(citations.length - i);
            System.out.println(i + 1);
            System.out.println();
            if((citations.length - i >= el) && (i + 1 <= el)) {
                answer = el;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {2,4,7,6,7};
        solution(citations);
    }
}
