package programmars.test42577;

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // 1. phone_book을 정렬한다.
        Arrays.sort(phone_book);

        // 2. 1중 for loop을 돌면서 앞번호가 뒷번호의 접두어인지 확인한다.
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        // 3. 여기까지 오지 못했다면 접두어가 없다는 뜻이다.
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Solution sol = new Solution();
        System.out.println(sol.solution(phone_book));
    }
}
