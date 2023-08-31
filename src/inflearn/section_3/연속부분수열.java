package inflearn.section_3;

import java.util.Scanner;

public class 연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int targetValue = sc.nextInt();
        int[] input = new int[n];

        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();

        System.out.println(solution(n, targetValue, input));
    }

    public static int solution(int n, int targetValue, int[] input){
        int answer = 0;

        int lt = 0;
        int rt = 1;
        int sum = input[lt] + input[rt];

        while (rt < n) {
            if(sum < targetValue){
                if(rt == n-1) break;
                sum += input[++rt];
            } 
            else if(sum == targetValue){
                answer++;
                if(rt == n-1) break;
                sum -= input[lt++];
                sum += input[++rt];
            }
            else {
                sum -= input[lt++];
            }
        }

        return answer;
    }
}
