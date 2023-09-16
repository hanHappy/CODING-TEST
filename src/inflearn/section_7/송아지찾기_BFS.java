package inflearn.section_7;

import java.util.*;

public class 송아지찾기_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));
    }
    public static int bfs(int s, int e){
        int answer = 0;

        int[] dist = {-1, 1, 5};
        boolean[] check = new boolean[10001];

        Queue<Integer> list = new LinkedList<>();
        list.add(s);
        check[s] = true;

        a:
        while(true){
            answer++;
            int length = list.size();
            for(int i = 0; i < length; i++){
                int current = list.poll();
                for(int x : dist){
                    int next = current + x;
                    if(next == e) break a;
                    if(1 <= next && next <= 10000 && !check[next]){
                        list.add(next);
                        check[next] = true;
                    }
                }
            }
        }

        return answer; 
    }
}
