package programmars.test42583;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int sum = 0;
        int time = 0;

        // 다리 만들기
        Queue<Integer> bridge = new LinkedList<>();

        // 다리가 비어있으면 트럭 넣기
        for (int i = 0; i < truck_weights.length; i++) {

            int truck = truck_weights[i];

            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    sum -= bridge.poll();
                } else {
                    if (sum + truck <= weight) {
                        bridge.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }

        }

        System.out.println(time + bridge_length);
        return time + bridge_length;
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        solution(bridge_length, weight, truck_weights);
    }
}
