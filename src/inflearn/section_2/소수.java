package inflearn.section_2;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.nextInt()));
    }

    // 에라토스테네스 체
    public static int solution(int n){
        int answer = 0;

        boolean[] arr = new boolean[n+1];

        arr[0] = arr[1] = true;
        // n의 제곱근만큼만 반복하는 이유
        // 그 이후의 수들의 경우 두번째 for문에서 이미 처리되었기 때문
        for(int i = 2; i < Math.sqrt(n); i++){
            if(arr[i] == true) continue;

            // j = i * i 부터 시작하는 이유
            // 제거할 소수의 배수 중 가장 작은 수가 해당 소수의 제곱이기 때문
            // 그 이하의 배수(i * (i-1))는 이전(i-1 차례)에 처리됨
            for(int j = i*i; j < n+1; j += i){
                arr[j] = true;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == false) answer++;
        }

        return answer;
    }
}
