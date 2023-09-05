package inflearn.section_5;

import java.util.*;

public class 크레인인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++)
            moves[i] = sc.nextInt();

        System.out.println(solution(n, board, m, moves));
    }

    public static int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int col : moves){
            col--;
            
            // 가장 위 인형 찾기
            int row = 0;
            while(board[row][col] == 0){
                row++;
                if(row == board.length-1) break;
            }

            // 인형 없으면 continue
            if(board[row][col]==0) continue;

            // 인형 쌓기
            // 첫 인형
            if(stack.empty())
                stack.push(board[row][col]);
            // 같은 인형이면
            else if(board[row][col] == stack.peek()){
                stack.pop();
                answer++;
            // 다른 인형이면
            } else {
                stack.push(board[row][col]);
            }

            // 꺼낸 인형 자리 초기화
            board[row][col] = 0;

        }

        return answer * 2;
    }
}