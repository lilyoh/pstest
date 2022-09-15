package programmars.test12909;

import java.util.Stack;

class Solution {
    static boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(c);
            } else {
                if (stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String s = "()()"; // t
        String ss = "(())()"; // t
        String sss = ")()("; // f
        String ssss = "(()("; // f

        System.out.println(solution(s));
        System.out.println(solution(ss));
        System.out.println(solution(sss));
        System.out.println(solution(ssss));

    }
}