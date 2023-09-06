package inflearn.section_5;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(solution(sc.next()));
    }




























    



    // public static int solution(String input){
    //     int answer = 0;

    //     Stack<Integer> stack = new Stack<>();

    //     for(char x : input.toCharArray()){
    //         if(Character.isDigit(x))
    //             stack.push(x - '0');
    //         else{
    //             int rt = stack.pop();
    //             int lt = stack.pop();

    //             if(x == '+') stack.push(lt+rt);
    //             else if(x == '-') stack.push(lt-rt);
    //             else if(x == '/') stack.push(lt/rt);
    //             else stack.push(lt*rt);
    //         }
    //     }

    //     answer = stack.pop();

    //     return answer;
    // }
}
