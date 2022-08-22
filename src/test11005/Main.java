package test11005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        int rest;
        // rest 를 담을 ans 선언
        String ans = "";

        while (n > 0) {
            // n 을 b 로 나눈 나머지를 rest에 할당
            rest = n % b;
            // rest 가 10보다 클 경우
            if(rest >= 10 ) {
                ans += (char)(rest - 10 + (int)'A');
            } else {
                // rest 가 10보다 작을 경우
                ans += (char)(rest + (int)'0');
            }
            // n 을 b 로 나눈 몫을 다시 n 에 할당
            n /= b;
        }

        // ans의 뒤에서부터 출력
        for(int i = ans.length() - 1; i >= 0; i--) {
            System.out.print(ans.charAt(i));
        }
    }
}
