package programmars.test42587;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static int solution(int[] priorities, int location) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 1;

        for(int p : priorities) {
            pq.add(p);
        }

        while(!pq.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    if(i == location) {
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 1;

        solution(priorities, location);
    }
}