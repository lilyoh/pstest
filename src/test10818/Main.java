package test10818;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int [n]; // 배열 선언, 초기화 방법 기억해

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close(); // scan 닫아주는 거 기억해
        Arrays.sort(arr); // Arrays.sort() 메서드 있는 거 기억하고, 사용할 때는 java.util.Arrays 해줘야 함

        System.out.println(arr[0] + " " + arr[n - 1]);
    }
}
