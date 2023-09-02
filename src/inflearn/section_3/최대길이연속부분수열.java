package inflearn.section_3;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];
        
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        
        // System.out.println(solution(n, k, input));
    }


    // ★★★★★★★★★★★★★★ 정답 보지마 ★★★★★★★★★★★★★★
    // ★★★★★★★★★★★★★★ 정답 보지마 ★★★★★★★★★★★★★★
    // ★★★★★★★★★★★★★★ 정답 보지마 ★★★★★★★★★★★★★★
    // ★★★★★★★★★★★★★★ 정답 보지마 ★★★★★★★★★★★★★★
    // ★★★★★★★★★★★★★★ 정답 보지마 ★★★★★★★★★★★★★★
    // ★★★★★★★★★★★★★★ 정답 보지마 ★★★★★★★★★★★★★★

    // public static int solution(int n, int k, int[] input){
    //     int answer = 0;
    //     int count = 0;
    //     int lt = 0;

    //     for(int rt = 0; rt < n; rt++){
    //         if(input[rt]==0) count++;
    //         while(count > k){   // 3 > 2
    //             if(input[lt]==0) count--;
    //             lt++;
    //         }
    //         answer = Math.max(answer, rt-lt+1);
    //     }

    //     return answer;
    // }
}
