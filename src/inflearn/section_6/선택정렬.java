package inflearn.section_6;

import java.util.*;

public class 선택정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(solution(n, input)[i] + " ");
        }
    }
    public static int[] solution(int n, int[] input){
        for(int i = 0; i < n-1; i++){
            int idx = i;
            for(int j = i+1; j < n; j++){
                if(input[idx] > input[j])
                    idx = j;
            }
            int temp = input[idx];
            input[idx] = input[i];
            input[i] = temp;
        }

        return input;
    }
}
