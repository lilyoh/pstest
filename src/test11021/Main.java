// 정수 a, b 받음
// test case 개수 T
// 각 테스트 케이스마다 "Case #x: " 출력한 다음 a+b 결과 출력
// 테스트 케이스 번호는 1부터 시작

// t를 받아줌
// BufferedReader로 띄어쓰기 포함된 숫자 2개를 받아주고
// StringTokenizer로 둘을 나눠준 다음 a, b에 각각 담아줌
// a+b를 출력할건데 이때 case를 포함해서 출력
// 근데 숫자를 출력해야함! - t를 받았으니까 위에꺼를 for문으로 돌리면서 i + 1 로 처리해주자

////////// BufferedReader + System.out.println()
////////// BufferedReader + System.out.printf()

package test11021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

//            System.out.printf("Case #%d: %d\n", i, (a+b));
            System.out.println("Case #" + i + ": " + (a+b));
        }

        br.close();
    }
}

// println이 printf 보다 메모리는 많이, 시간은 적게 잡아먹음
