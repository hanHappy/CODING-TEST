package inflearn.section_7;

import java.util.*;

/*
 * 첫째 줄에는 정점의 수 n (1<=n<=20)과 간선의 수 m이 주어집니다
 * 그 다음부터 m줄에 걸쳐 연결정보가 주어집니다
 * 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요
 * 입력 예제
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 * 출력 예제
2 : 3
3 : 1
4 : 1
5 : 2
6 : 2
 */
public class 그래프최단거리_BFS {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;
    static int[] dist;

    public static void bfs(int v){
        Queue<Integer> list = new LinkedList<>();
        list.add(v);
        while(!list.isEmpty()){
            int current = list.poll();
            for(int x : graph.get(current)){
                if(!check[x]){
                    list.add(x);
                    check[x] = true;
                    dist[x] = dist[current] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
        check = new boolean[n+1];
        dist = new int[n+1];

        for(int i = 0; i < m; i++)
            graph.get(sc.nextInt()).add(sc.nextInt());

        check[1] = true;
        bfs(1);
        for(int i = 2; i < n+1; i++)
            System.out.printf("%d : %d\n", i, dist[i]);
    }
}

// public class 그래프최단거리_BFS {
//     static int n, m;
//     static int[][] graph;
//     static boolean[] check;
//     static int[] answer;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         m = sc.nextInt();
//         graph = new int[n+1][n+1];
//         for(int i = 0; i < m; i++)
//             graph[sc.nextInt()][sc.nextInt()] = 1;
//         check = new boolean[n+1];
//         answer = new int[n+1];

//         check[1] = true;
//         bfs(1);
//         for(int i = 2; i < n+1; i++)
//             System.out.printf("%d : %d\n", i, answer[i]);
//     }
//     public static void bfs(int v) {

//         Queue<Integer> list = new LinkedList<>();
//         list.add(v);

//         int lv = 1;

//         while(!list.isEmpty()){
//             int length = list.size();
//             for(int i = 0; i < length; i++){
//                 int row = list.poll();
//                 for(int col = 1; col < n+1; col++){
//                     if(graph[row][col] == 1 && !check[col]){
//                         list.add(col);
//                         check[col] = true;
//                         answer[col] = lv;
//                     }
//                 }
//             }
//             lv++;
//         }
//     }
// }
 