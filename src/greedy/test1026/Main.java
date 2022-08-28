package greedy.test1026;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 정수 n과 배열 a, b 입력받기
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        // 배열 a를 오름차순으로 정렬
        Arrays.sort(a);

        // 배열 b를 내림차순으로 정렬
        Integer[] castedB = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(castedB, Collections.reverseOrder());

        // 배열 a의 요소와 b의 요소를 곱해서 result에 더하기
        int result = 0;
        for(int i = 0; i < n; i++) {
            result += a[i] * castedB[i];
        }

        System.out.println(result);
    }
}
