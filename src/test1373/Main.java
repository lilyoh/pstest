package test1373;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        StringBuilder sb = new StringBuilder();

        // 3자리씩 끊었을 때 1자리만 남을 경우
        if(n.length() % 3 == 1)
            sb.append(n.charAt(0));
        // 3자리씩 끊었을 때 2자리만 남을 경우
        if(n.length() % 3 == 2)
            sb.append((n.charAt(0) - '0') * 2 + n.charAt(1) - '0');
        // 나머지 경우
        for(int i = n.length() % 3; i < n.length(); i += 3) {
            sb.append((n.charAt(i) - '0') * 4 + (n.charAt(i + 1) - '0') * 2 + (n.charAt(i + 2) - '0'));
        }

        System.out.println(sb);

    }
}
