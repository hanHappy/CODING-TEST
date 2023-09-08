package inflearn.section_6;

import java.util.Scanner;

public class 삽입정렬 {
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
            for(int j = i+1; j > 0; j--){
                if(input[j-1] > input[j]){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }

        return input;
    }

}
