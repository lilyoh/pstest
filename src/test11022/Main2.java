package test11022;

////////// Scanner 사용방법

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scan.nextInt();

        for(int i=1; i<=T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        }

        System.out.print(sb);
    }
}