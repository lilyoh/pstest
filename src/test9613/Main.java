package test9613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int tc = 0; tc < t; tc++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            long sum = 0;

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < i; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }
            System.out.println(sum);
        }
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
