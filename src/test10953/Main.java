package test10953;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        // BufferedReader 생성해서 input 받을 수 있게 준비
        // 콤마로 구분해서 들어오기 때문에 ,로 나눌 수 있도록 StringTokenizer 준비
        // 받은 인풋 넣으려고 str 생성
        // t를 받을 것
        // t의 수만큼 for문 돌릴 것
        //// str 받아서 콤마 기준으로 나눠주기
        //// a랑 b에 나눈 숫자 형변환 해서 넣어주기
        //// a + b 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        int t = Integer.parseInt(br.readLine());
        for(int i = 0;  i < t; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, ",");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }
    }
}
