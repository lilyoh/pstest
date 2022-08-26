package greedy.test2839;

import java.util.Scanner;

 public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if(n % 5 == 0) {
            return n / 5;
        }

        for(int i = 1; i * 5 < n; i++) {
            for(int j = 1; j * 3 + i * 5 <= n; j++) {
                if((i * 5) + (j * 3) == n) {
                    return i + j;
                }
            }
        }

        if(n % 3 == 0) {
            return n / 3;
        }

        return -1;
    }
}