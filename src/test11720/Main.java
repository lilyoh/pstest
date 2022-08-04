// Scanner로 입력받아 charAt() 사용

package test11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String s = scan.next();
        scan.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += s.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
