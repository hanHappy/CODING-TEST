package inflearn.section_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬나라_BFS {

    static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
    static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

    static void bfs(int x, int y, int[][] map) {
        Queue<Island> list = new LinkedList<>();
        list.add(new Island(x, y));

        int n = map.length;

        while (!list.isEmpty()) {
            Island island = list.poll();
            for (int k = 0; k < 8; k++) {
                int nx = island.x + dx[k];
                int ny = island.y + dy[k];
                if (0 <= nx && nx < n
                        && 0 <= ny && ny < n
                        && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    list.add(new Island(nx, ny));
                }
            }

        }
    }

    static int solution(int[][] map) {
        int answer = 0;
        int n = map.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    map[i][j] = 0;
                    bfs(i, j, map);
                }
            }
        }
        return answer;
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

class Island {
    int x, y;

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
    }

}