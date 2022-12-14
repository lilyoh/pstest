package greedy.test11399;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 사람 수와 기다리는 분 수 입력받기
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[] minute = new int[people];

        for(int i = 0; i < people; i++) {
            minute[i] = sc.nextInt();
        }

        // minute 배열 오름차순 정렬
        Arrays.sort(minute);

        // 인당 분을 더하고, 모든 분을 더하기
        int result = 0;
        for(int i = 0; i < minute.length; i++) {
            for(int j = 0; j <= i; j++) {
                result += minute[j];
            }
        }

//        int currentTime = 0;
//        int result = 0;
//        for(int i = 0; i < minute.length; i++) {
//            currentTime = currentTime + minute[i];
//            result = result + currentTime + minute[i];
//        }

        // before current, minute, after current, result
        // 0, 1, 1, 1
        // 1, 2, 3, 4
        // 3, 3, 6. 10
        // 6, 3, 9, 19
        // 9, 4, 13, 32

        System.out.println(result);
    }
}
