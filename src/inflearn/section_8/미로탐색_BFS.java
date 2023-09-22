package inflearn.section_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색_BFS {
    static int[][] maze, dis;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    static int bfs(int x, int y) {
        maze[x][y] = 1;

        Queue<Coordinate> list = new LinkedList<>();
        list.add(new Coordinate(x, y));

        while (!list.isEmpty()) {

            Coordinate current = list.poll();

            for (int j = 0; j < 4; j++) {
                int nx = current.x + dx[j];
                int ny = current.y + dy[j];

                if(nx == 6 && ny == 6){
                    return dis[current.x][current.y] + 1;
                }

                if (0 <= nx && nx <= 6 && 0 <= ny && ny <= 6 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    list.add(new Coordinate(nx, ny));
                    dis[nx][ny] = dis[current.x][current.y] + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maze = new int[7][7];
        dis = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println(bfs(0, 0));
    }
}

class Coordinate {
    int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
