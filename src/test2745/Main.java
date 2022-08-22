package test2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.next(); // 문자열일수도 있지 않나
        int b = scan.nextInt();

        // b진법 n을 10진법으로 바꾸면 항상 10억보다 작거나 같다고 했으므로 int형으로 생성
        int result = 0;
        int num = 0;
        int idx = 0;

        for(int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            if(c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}
