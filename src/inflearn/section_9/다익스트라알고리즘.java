package inflearn.section_9;

import java.util.*;

public class 다익스트라알고리즘 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;

    static int[] dis;

    static int solution(int v){
        int answer = 0;

        PriorityQueue<Edge> list = new PriorityQueue<>();
        // 1번 출발
        list.add(new Edge(v, 0));
        dis[v] = 0;

        while(!list.isEmpty()){
            Edge current = list.poll();
            int currentVex = current.vex;
            int currentCost = current.cost;
            
            if(currentCost > dis[currentVex]) continue;

            for(Edge next : graph.get(currentVex)){
                if(currentCost + next.cost < dis[next.vex]){
                    dis[next.vex] = currentCost + next.cost;
                    list.add(new Edge(next.vex, currentCost + next.cost));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        dis = new int[n + 1];

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<Edge>());

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }

        solution(1);

        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE)
                System.out.println(i + " : " + dis[i]);
            else
                System.out.println(i + " : impossible");
        }
    }
}

class Edge implements Comparable<Edge> {
    int vex, cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Edge [vex=" + vex + ", cost=" + cost + "]";
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }

}
