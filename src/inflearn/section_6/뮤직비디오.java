package inflearn.section_6;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        // System.out.println(solution(n, m, input));
    }

    public static int solution(int n, int m, int[] input){
        int answer = 0;
        return answer;
    }




    // public static int solution(int n, int m, int[] input){
    //     int answer = 0;

    //     int lt = Arrays.stream(input).max().getAsInt();
    //     int rt = Arrays.stream(input).sum();

    //     while(lt <= rt){
    //         int mid = (lt + rt) / 2;
    //         if(count(input, mid) <= 3){
    //             answer = mid;
    //             rt = mid-1;
    //         }
    //         else lt = mid+1;
    //     }

    //     return answer;
    // }
    // public static int count(int[] input, int capacity){
    //     int count = 1;
    //     int sum = 0;

    //     for(int x : input){
    //         if(sum + x >= capacity){
    //             count++;
    //             sum = x;
    //         } else sum += x;
    //     }
    //     return count;
    // }
}
