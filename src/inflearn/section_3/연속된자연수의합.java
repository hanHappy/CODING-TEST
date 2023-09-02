package inflearn.section_3;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }
    public static int solution(int target){
        int answer = 0;

        int n = 1;
        int sum = 1;

        while(sum < target){
            sum += ++n;
            if((target-sum)%n==0)
                answer++;
        }

        return answer;
    }

    // public static int solution(int target){
    //     int answer = 0;

    //     int lt = 1;
    //     int rt = 2;
    //     int sum = lt + rt;

    //     while(lt < rt){
    //         if(sum < target){
    //             sum += ++rt;
    //         } 
    //         else if(sum > target){
    //             sum -= lt;
    //             lt++;
    //         }
    //         else{
    //             answer++;
    //             sum -= lt++;
    //             sum += ++rt;
    //         }
    //     }

    //     return answer;
    // }
}
