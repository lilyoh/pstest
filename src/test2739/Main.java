package test2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N < 1 || N > 9) return;
        else {
            for(int i = 1; i <= 9; i++) {
                System.out.println(N + " * " + i + " = " + (N * i));
            }
        }
    }
}
