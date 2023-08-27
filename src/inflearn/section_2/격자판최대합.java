package inflearn.section_2;

import java.util.Scanner;

public class 격자판최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] input = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(input));

    }
    public static int solution(int[][] input){
        int max = 0;
        int sum1, sum2;
        for(int i = 0; i < input.length; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < input.length; j++){
                sum1 += input[i][j];
                sum2 += input[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }
        
        sum1 = sum2 = 0;

        for(int i = 0; i < input.length; i++){
            sum1 += input[i][i];
            sum2 += input[i][input.length-(i+1)];
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }
        
        return max;
    }

    // public static int solution(int[][] input){
    //     int max = 0;
    //     for(int i = 0; i < input.length; i++){
    //         int sum = 0;
    //         for(int j = 0; j < input.length; j++){
    //             sum += input[i][j];
    //         }
    //         if(sum > max)
    //             max = sum;
    //     }
    //     for(int i = 0; i < input.length; i++){
    //         int sum = 0;
    //         for(int j = 0; j < input.length; j++){
    //             sum += input[j][i];
    //         }
    //         if(sum > max)
    //             max = sum;
    //     }
    //     int sum = 0;
    //     for(int i = 0; i < input.length; i++){
    //         sum += input[i][i];
    //         if(sum > max)
    //             max = sum;
    //         }
    //         sum = 0;
    //     for(int i = 0; i < input.length; i++){
    //         sum += input[i][input.length-(i+1)];
    //         if(sum > max)
    //             max = sum;
    //     }
    //     return max;
    // }

}
