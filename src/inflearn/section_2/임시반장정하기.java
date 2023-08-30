package inflearn.section_2;

import java.util.Scanner;

public class 임시반장정하기 {
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

        int max = -1;
        for(int i = 0; i < studentsNum; i++){
            if(scores[i] > answer){
                max = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]==max){
                answer = scores[i];
                break;
            }
        }

        return answer+1;
    }
}
