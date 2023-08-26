package inflearn.section_2;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.nextInt()));
    }
    public static int solution(int n){
        int answer = 0;

        boolean[] arr = new boolean[n+1];

        arr[0] = arr[1] = true;

        for(int i = 2; i < Math.sqrt(n); i++){
            if(arr[i] == true) continue;

            for(int j = i*i; j < n+1; j += i){
                arr[j] = true;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == false) answer++;
        }

        // int[] arr = new int[n+1];

        // for(int i = 2; i < n+1; i++){
        //     if(arr[i] == 0) {
        //         answer++;
        //         for(int j = i; j < n+1; j += i)
        //             arr[j] = 1;
        //     }
        // }

        return answer;
    }
}
