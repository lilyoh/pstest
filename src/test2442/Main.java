package test2442;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (i*2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
