package test10818;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 안쓰지만 입력은 받는다!
        int max = -1000001;
        int min = 1000001;

        while(scan.hasNext()) {
            int val = scan.nextInt();

            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }

        System.out.println(min + " " + max);
    }
}

// 배열을 사용하지 않고 푸는 방법
// 배열 문제이지만
// 배열은 시간 복잡도가 n^2가 될 수 있으므로 배열 안쓰는 방법으로도 풀어보기