package test10952;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // 입력을 정수 a와 b로 쪼개기 위해서 사용
        StringBuilder sb = new StringBuilder(); // 마지막에 한번에 출력하려고 사용

        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) break; // 0 두 개가 들어오면 while문 종료
            sb.append(a + b + "\n");
        }
        System.out.print(sb);
    }
}
