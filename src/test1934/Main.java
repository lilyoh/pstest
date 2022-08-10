package test1934;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scan.nextInt();

        for(int i = 0; i < T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int d = gcd(a, b);

            sb.append(a * b / d).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
