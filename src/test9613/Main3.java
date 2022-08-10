package test9613;

import java.util.*;

public class Main3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //t 받아주기
        int t = sc.nextInt();

        // t보다 1 작은 수부터 시작해서 0 전까지
        while (t-- > 0) {

            // 각 줄에 몇개씩 받을지 정하는 n 입력받기
            int n = sc.nextInt();

            // n 개만큼 크기를 갖는 int 형 배열 a 생성
            int[] a = new int[n];

            // n개 크기만큼 a 배열에다가 숫자 받음
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            // 총 합 넣을 ans 생성
            long ans = 0;

            // 이중포문으로 ans에 gcd 계산한거 계속 쌓아주기
            for (int i=0; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {
                    ans += gcd(a[i], a[j]);
                }
            }
            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
