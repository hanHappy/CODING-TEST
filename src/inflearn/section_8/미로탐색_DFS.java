package inflearn.section_8;

import java.util.Scanner;

public class 미로탐색_DFS {

    static int[][] maze;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int answer = 0;

    public static void dfs(int x, int y) {
        if (x == 6 && y == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx <= 6 && 0 <= ny && ny <= 6 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maze = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[0][0] = 1;
        dfs(0, 0);
        System.out.println(answer);
    }
}
