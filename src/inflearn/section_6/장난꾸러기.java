package inflearn.section_6;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        
        System.out.println(solution(n, input));
    }
    public static String solution(int n, int[] input){
        String answer = "";
        
        int[] comp = Arrays.copyOf(input, n);

        Arrays.sort(input);

        for(int i = 0; i < n; i++){
            if(input[i] != comp[i])
                answer += i+1 + " ";
                
        }

        return answer;
    }
}
