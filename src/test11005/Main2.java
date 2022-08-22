package test11005;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        // n 이 0 이상일 동안
        // ck(n, b)의 값을 char형 변환해서 스택에 push
        while(n > 0) {
            stack.push((char)(ck(n, b)));
            n /= b;
        }
        // 스택이 빌 때까지 스택 안의 값을 꺼내옴
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    // int 형 n, b를 받아서
    // n % b (나머지) 가 9 보다 크면 -- 나머지에 55를 더해주고
    // 9와 같거나 작으면 -- 나머지에 48을 더해줌
    private static int ck(int n, int b) {
        return n % b > 9 ? (n % b + 55) : (n % b + 48);
    }
}


//
//    Stack<Character> stack = new Stack<>();
//
//    StringTokenizer st = new StringTokenizer(br.readLine());
//    long a = Long.parseLong(st.nextToken());
//    long b = Long.parseLong(st.nextToken());
//
//		while(a > 0) {
//                stack.push((char)(ck(a, b)));
//
//                a /= b;
//                }
//
//                while(!stack.isEmpty()) bw.write(stack.pop());
//                bw.flush();
//                bw.close();
//                br.close();
//                }
//private static long ck(long a, long b) {
//        return a%b > 9 ? (a%b + 55) : (a%b + 48);
//        }