package programmars.test42746;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String solution(int[] numbers) {

        // int 배열을 string 배열로 변환하기
        String[] strnumbers = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strnumbers[i] = String.valueOf(numbers[i]);
        }

        // 내림차순으로 정렬하기
        Arrays.sort(strnumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // 가장 큰 값이 0이면 0리턴
        if(strnumbers[0].equals("0")) return "0";

        // 다 붙여서 출력하기
        StringBuilder sb = new StringBuilder();
        for(String s : strnumbers) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);
    }
}