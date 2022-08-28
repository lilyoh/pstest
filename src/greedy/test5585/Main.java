package greedy.test5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int change = 1000 - n;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int result = 0;

        for (int i = 0; i < coin.length; i++) {
            result += change / coin[i];
            change = change % coin[i];
        }

        System.out.println(result);
    }
}