package inflearn.section_7;

import java.util.*;

public class 경로탐색_인접리스트 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;

    static void bfs(int v){
        if(v == n)
            answer++;
        else {
            for(int x : graph.get(v)){
                if(!check[x]){
                    check[x] = true;
                    bfs(x);
                    check[x] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        check = new boolean[n+1];
        for(int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
        for(int i = 0; i < m; i++)
            graph.get(sc.nextInt()).add(sc.nextInt());
        check[1] = true;
        bfs(1);
        System.out.println(answer);
    }
}
