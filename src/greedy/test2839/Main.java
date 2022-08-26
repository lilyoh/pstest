package greedy.test2839;


public class Main {
    public static void main(String[] args) {

        int[] nums = {28};
        test(nums);

//        System.out.println(solution(11));
    }

    public static void test(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            System.out.println("current: " + current);

            System.out.println("result: " + solution(current));
        }
    }
    public static int solution(int n) {
        if(n % 5 == 0) {
            return n / 5;
        }

        for(int i = n / 5; i >= 1; i--) {
            for(int j = 1; j * 3 + i * 5 <= n; j++) {
                if((i * 5) + (j * 3) == n) {
                    return i + j;
                }
            }
        }

        if(n % 3 == 0) {
            return n / 3;
        }

        return -1;
    }
}
