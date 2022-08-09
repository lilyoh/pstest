package test10992;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n - 1; i++) {
            // 앞쪽 공백 출력
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 뒤쪽 별+공백+별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 맨 마지막 줄
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*");
        }
    }
}
