package test9613;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // t 받아주기
        int t = sc.nextInt();

        // t 만큼 돌려준다는 뜻
        for (int tc = 0; tc < t; tc++) {

            // 각 행에 몇 개의 숫자 받을지 정하는 n
            int n = sc.nextInt();

            // n 만큼의 크기를 가지는 배열 생성
            int []arr = new int[n];

            // 배열의 i번째만큼 숫자 받기
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            // 1,000,000
            // 처음에 int로 해서 틀렸다고 하심
            // 최대공약수를 다 합한 값을 저장할 sum
            long sum=0;//처음에 int여서 틀림..

            // n만큼 돌면서
            // 같은 인덱스 빼고
            // sum에 최대공약수 더하기
            for(int i=0;i<n;i++) {
                for(int j=i;j<n;j++) {
                    if(i!=j) {
                        sum+=gcd(arr[i],arr[j]);
                    }
                }
            }
            System.out.println(sum);
        }
    }


    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
