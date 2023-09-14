package inflearn.section_6;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        System.out.println(solution(n, c, input));
    }

    public static int solution(int n, int c, int[] input){
        int answer = 0;
        Arrays.sort(input);
        
        return answer;
    }
}
