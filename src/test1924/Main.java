package test1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        scan.close();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = day;
        for(int i = 0; i < month -1; i++) {
            totalDays += daysInMonth[i];
        }

        System.out.println(dayOfTheWeek[totalDays % 7]);
    }
}

// 배열로 미리 월별 인수, 요일을 선언해둠
// 1월부터 입력받은 월수 -1 월의 일수를 모두 더하고, 입력받은 일수를 더해 총 일수를 구함
// 총 일수를 7로 나눈 나머지를 가지고 요일 배열에서 요일을 찾음