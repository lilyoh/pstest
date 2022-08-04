package test10953;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) {

        // Scanner 이용
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String str;
        StringTokenizer st;

        for(int i = 0; i < T; i++) {
            // 콤마를 기준으로 두 개의 숫자가 들어오기 때문에 String으로 취급
            str = scan.next();
            st = new StringTokenizer(str, ",");

            // String 타입이므로 int형으로 변환
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }
        scan.close();
    }
}
