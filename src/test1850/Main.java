package test1850;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        String firstOne = "";
        String secondOne = "";

        for(int i = 0; i < a; i++) {
            firstOne.concat("1");
        }
        for(int i = 0; i < b; i++) {
            secondOne.concat("1");
        }

        System.out.println(firstOne);
        System.out.println(secondOne);
    }

    public static int gcd(int firstOne, int secondOne) {
        if(secondOne == 0) return firstOne;
        return gcd(secondOne, firstOne % secondOne);
    }
}
