package test10952;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b;
        int[] arr = new int[0];

        while(true) {
            a = scan.nextInt();
            b = scan.nextInt();

            if(a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        }

        scan.close();

    }
}
