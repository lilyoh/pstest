// test case t
// a b
// 0 < a b < 10 -- 한자리수, 공백 하나 -- charAt

package test11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            String str = br.readLine();
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';

            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}

// String.charAt()은 해당 위치의 문자를 char로 반환
// 만약 0이라는 문자열이 반환되면 아스키 코드값인 48이 반환됨
// 이를 int 형으로 연산하려고 하거나 문자 출력이 아닌 정수 출력을 하고자 하면 48이 출력됨
// 그러므로 예를 들어 '6'을 숫자 6으로 바꾸고 싶다면 48을 빼주면 되고,
// 몇을 뺄지 모르겠다면 '0'을 빼줘도 됨