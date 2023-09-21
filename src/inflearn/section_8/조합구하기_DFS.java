package inflearn.section_8;

import java.util.Scanner;

public class 조합구하기_DFS {
    static int n, m;
    static int[] answer;

    public static void dfs(int l, int s) {
        if (l == m) {
            for (int x : answer)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                answer[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        dfs(0, 1);
    }
}
