package inflearn.section_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 동전교환 {
    public static int bfs(int[] coins, int m){
        int answer = 1;
        Queue<Integer> list = new LinkedList<>();
        for(int x : coins)
            list.add(x);
        
        while(!list.isEmpty()){
            answer++;
            int length = list.size();
            for(int i = 0; i < length; i++){
                int current = list.poll();
                for(int x : coins){
                    int sum = current + x;
                    if(sum == m) return answer;
                    list.add(sum);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++)
            coins[i] = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(bfs(coins, m));
    }
}
