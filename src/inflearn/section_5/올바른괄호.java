package inflearn.section_5;

import java.util.*;

public class 올바른괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));
    }



    public static String solution(String input){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : input.toCharArray()){
            if(x == ')' && stack.empty())
                return "NO";
            if(x=='(')
                stack.push(x);
            else
                stack.pop();
        }

        if(!stack.empty())
            return "NO";

        return answer;
    }

    // public static String solution(String input){
    //     String answer = "YES";
    //     int count = 0;
    //     for(char x : input.toCharArray()){
    //         if(x == ')' && count == 0)
    //             return "NO";
    //         else if(x == '(') 
    //             count++;
    //         else if(x == ')') 
    //             count--;
    //     }
    //     if(count != 0)
    //         return "NO";
    //     return answer;
    // }
}
