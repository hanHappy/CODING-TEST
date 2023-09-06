package inflearn.section_5;

import java.util.*;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
    public static int solution(String input){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        char[] arr = input.toCharArray();
        int lt = 0;
        for(int rt = 1; rt < input.length(); rt++){
            if(arr[lt] == '('){
                if(arr[rt] == '('){
                    stack.push(1);
                    answer++;
                }
                else{
                    answer += stack.size();
                }
            }
            else{
                if(arr[rt] == '('){
                    lt++;
                    continue;
                }
                else {
                    stack.pop();
                }
            }
            lt++;
        }

        return answer;
    }
}
