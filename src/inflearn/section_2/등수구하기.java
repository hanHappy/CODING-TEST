package inflearn.section_2;

import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }
        System.out.println(solution(input));
    }
    public static String solution(int[] input){
        String answer = "";

        int rank = 1;
        for(int i = 0; i < input.length; i++){
            rank = 1;
            for(int j = 0; j < input.length; j++){
                if(j == i) 
                    continue;
                if(input[i] < input[j])
                    rank++;
            }
            answer += rank + " ";
        }

        return answer;
    }
}
