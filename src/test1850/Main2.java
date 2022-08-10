package test1850;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       long a = scan.nextLong();
       long b = scan.nextLong();

       long c = gcd(a, b);

       for(int i = 0; i < c; i++) {
           sb.append("1");
       }

        System.out.println(sb);
    }

   public static long gcd(long a, long b) {
//        if(b == 0) return a;
//        return gcd(b, a % b);

       while(b > 0) {
           long tmp = a;
           a = b;
           b = tmp % b;
       }
       return a;
   }
}
