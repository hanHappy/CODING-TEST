package inflearn.section_8;

import java.util.*;

public class 섬나라_DFS {

    static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
    static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

    static int solution(int[][] map){
        int answer = 0;
        int n = map.length;
        for(int i = 0; i < n; i++){
            for(int j= 0 ; j < n; j++){
                if(map[i][j] == 1){
                    answer++;
                    map[i][j] = 0;
                    dfs(i, j, n, map);
                }
            }
        }
        return answer;
    }

    static void dfs(int x, int y, int n, int[][] map) {
        for (int k = 0; k < 8; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (0 <= nx && nx < n
                    && 0 <= ny && ny < n
                    && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                dfs(nx, ny, n, map);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(map));
    }
}
