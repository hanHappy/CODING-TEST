package inflearn.section_8;

import java.util.*;

public class 토마토_BFS {
    static int n, m;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int[][] date;
    static int[][] box;

    static int bfs() {
        Map<String, Object> result = findRipeTomato();
        Queue<Tomato> list = (Queue<Tomato>) result.get("list");
        if ((boolean) result.get("isAllRipe") == true)
            return 0;

        while (!list.isEmpty()) {

            Tomato tomato = list.poll();

            for (int j = 0; j < 4; j++) {
                int nRow = tomato.row + dx[j];
                int nCol = tomato.col + dy[j];

                if (0 <= nRow && nRow <= n - 1
                        && 0 <= nCol && nCol <= m - 1
                        && box[nRow][nCol] == 0) {

                    box[nRow][nCol] = 1;
                    date[nRow][nCol] = date[tomato.row][tomato.col] + 1;

                    list.add(new Tomato(nRow, nCol));
                }
            }
        }

        int max = -1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(box[i][j] == 0)
                    return -1;
                max = Math.max(max, date[i][j]);
            }
        }

        return max;
    }

    private static Map<String, Object> findRipeTomato() {
        boolean flag = false;
        boolean isAllRipe = true;

        Queue<Tomato> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 1) {
                    list.add(new Tomato(i, j));
                }
                if (!flag) {
                    if (box[i][j] == 0) {
                        isAllRipe = false;
                        flag = true;
                    }
                }
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("list", list);
        result.put("isAllRipe", isAllRipe);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        box = new int[n][m];
        date = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = sc.nextInt();
            }
        }

        System.out.println(bfs());
    }
}

class Tomato {
    int row, col;

    public Tomato(int row, int col) {
        this.row = row;
        this.col = col;
    }

}
