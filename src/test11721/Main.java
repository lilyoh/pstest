// 길이가 n 인 문자열을 10개씩 끊어서 출력
// 문자열을 받음
// for 문으로 10개씩 끊기

package test11721;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

       Scanner scan = new Scanner(System.in);
       String input = scan.next();
       scan.close();

       for(int i = 0; i < input.length(); i++) {
           System.out.print(input.charAt(i));
           if(i % 10 == 9) {
               System.out.println();
           }
       }
    }
}
