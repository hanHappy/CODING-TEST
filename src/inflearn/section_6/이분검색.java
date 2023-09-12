package inflearn.section_6;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        System.out.println(solution(n, m, input));
    }
    public static int solution(int n, int m, int[] input){
        int answer = 0;
        Arrays.sort(input);
        int lt = 0;
        int rt = n-1;
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(input[mid] == m){
                answer = mid + 1;
                break;
            }
            if(input[mid] > m)
                rt = mid - 1;
            else
                lt = mid + 1;
        }
        return answer+1;
    }

    // public static int solution(int n, int m, int[] input){
    //     int answer = 0;
    //     Arrays.sort(input);
    //     int lt = 0;
    //     int rt = n-1;
    //     while(true){
    //         int mid = input[(lt+rt)/2];
    //         if(m > mid)
    //             lt += (rt-lt)/2;
    //         else if(m < mid)
    //             rt -= (rt-lt)/2;
    //         else{
    //             answer = lt + (rt-lt)/2;
    //             break;
    //         }

    //     }
    //     return answer+1;
    // }
}
