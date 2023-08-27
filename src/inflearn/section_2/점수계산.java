package inflearn.section_2;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }
        System.out.println(solution(input));
    }
    public static int solution(int[] input){
        int answer = 0;
        int bonus = 0;
        for(int x : input){
            if(x == 0) bonus = 0;
            answer += x + bonus;
            if(x == 1) bonus++;
        }
        return answer;
    }
}
