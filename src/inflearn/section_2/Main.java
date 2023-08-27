package inflearn.section_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] input = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, input));
    }

    public static int solution(int n, int[][] input) {
        int answer = 0;
        int studentsNum = input[0].length;
        int[] scores = new int[studentsNum];

        for (int i = 0; i < n; i++) {
            boolean[] check = new boolean[studentsNum];
            for(int j = 0; j < studentsNum-1; j++){
                boolean current = false;
                for(int k = j+1; k < studentsNum; k++){
                    if(check[k]) continue;
                    int base = input[j][i];
                    int comp = input[k][i];
                    if(base == comp){
                        current = true;
                        scores[k]++;
                        check[k] = true;
                    }
                }
                if(current) scores[j]++;
            }
        }

        int max = Arrays.stream(scores).max().getAsInt();

        for(int i = 0; i < studentsNum; i++){
            if(scores[i] == max)
                return i+1;
        }

        return answer;
    }
}
