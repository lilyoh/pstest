package programmars.test42586;

import java.util.*;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            queue.add((int)Math.ceil(100.0 - progresses[i]) / (speeds[i]));
        }

        List<Integer> answer = new ArrayList<>();
        while (!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                count++;
                queue.poll();
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        solution(progresses, speeds);
    }
}
