package inflearn.section_5;

import java.util.*;

public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));

    }
    public static String solution(String input){
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char x : input.toCharArray()){
            if(stack.empty() && x != '(' && x != ')')
                answer += x;
            else if(x == '(')
                stack.push(x);
            else if(x == ')')
                stack.pop();
        }

        return answer;
    }
}
