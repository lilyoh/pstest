package test1212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            String a = Integer.toBinaryString(s.charAt(i) - '0');
            if(a.length() == 2 && i != 0) a = "0" + a;
            else if(a.length() == 1 && i != 0) a = "00" + a;

            sb.append(a);
        }
        System.out.println(sb);
    }
}

// 풀이 과정
// 1. 입력값이 314라고 할 때
// 2. 맨 앞에 숫자부터 마지막 숫자까지 하나씩 2진법 변환 - for loop
// 2-1. 3을 Integer.toBinaryString으로 이진법 String으로 변환하여 변수 a 에 저장
// 2-2. 만약 변환한 String 길이가 2이고, 이게 입력값의 첫번째 수가 아닌 경우에 -- 앞에 String 0을 추가해서 3자리수 맞춰주기
// 2-3. 만약 변환한 String 길이가 1이고, 이게 입력값의 첫번째 수가 아닌 경우에 -- 앞에 String 00을 추가해서 3자리수 맞춰주기
// 3. sb에 append 해주고 출력

// 기억할 점
// 1. 8진수를 2진수로 변환하면 2진수 3자리
// 2. 2진법 변환 내장함수
//    Integer.toBinaryString(int num) -- java.lang 패키지