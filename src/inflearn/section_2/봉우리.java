package inflearn.section_2;

import java.util.Scanner;

public class 봉우리 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] input = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, input));
    }
    public static int solution(int n, int[][] input){
        int answer = 0;

        int[][] map = new int[n+2][n+2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i+1][j+1] = input[i][j];
            }
        }

        for(int row = 1; row < n+1; row++){
            int col = 1;
            while (col < n+1) {
                if(map[row][col] > map[row-1][col]
                    && map[row][col] > map[row][col+1]
                    && map[row][col] > map[row+1][col]
                    && map[row][col] > map[row][col-1]){
                    answer++;
                    col += 2;
                }
                else col++;
            }
        }

        return answer;
    }
}
