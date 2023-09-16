package inflearn.section_7;

/*
 * 첫 줄에 정점의 수 n(1<=n<=20)와 간선의 수 m이 주어집니다
 * 그 다음부터 m줄에 걸쳐 연결정보가 주어집니다
 * 1번에서 n번 정정므로 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요
 * 5 9
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 3
 * 2 5
 * 3 4
 * 4 2
 * 4 5
 */

import java.util.*;

public class 경로탐색_인접행렬 {
    static int n, m, answer = 0;
    static int[][] graph;
    static boolean[] check;

    public static void dfs(int v){
        if(v==n)
            answer++;
        else {
            for(int i = 1; i <= n; i++){
                if(!check[i] && graph[v][i] == 1){
                    check[i] = true;
                    dfs(i);
                    check[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        check = new boolean [n+1];
        for(int i = 0; i < m; i++)
            graph[sc.nextInt()][sc.nextInt()] = 1;
        check[1] = true;
        dfs(1);
        System.out.println(answer);
    }
}
 