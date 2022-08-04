////////// BufferedReader + BufferedWriter

package test11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + (a+b) + "\n");

//            sb.append("Case #").append(i).append(": ").append(a + b).append("\n");
//            System.out.println("Case #" + i + ": " + (a+b));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

// sb.append("Case #"+ i + ": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n" );
// 이런 식으로 한번에 써도 되는데 출력할 문자에 여러 타입이 섞여 있으면 해당 메소드는 일일이 타입 검사를 해줘야 하기 때문에 시간이 더 걸리다고 함