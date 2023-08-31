package inflearn.section_3;

import java.util.Scanner;

public class 최대매출 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int consecutiveDays = sc.nextInt();
        int[] input = new int[days];

        for(int i = 0; i < days; i++)
            input[i] = sc.nextInt();

        System.out.println(solution(days, consecutiveDays, input));

    }

    public static int solution(int days, int consecutiveDays, int[] input){
        int answer = 0;

        int sum = 0;
        for(int i = 0; i < consecutiveDays; i++)
            sum += input[i];
        
        answer = sum;
        
        for(int i = 0; i < input.length-(consecutiveDays+1); i++){
            sum -= input[i];
            sum += input[i+consecutiveDays];
            
            answer = Math.max(answer, sum);
        }

        return answer;
    }

}
