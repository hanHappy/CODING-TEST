package inflearn.section_8;

import java.util.Scanner;

public class 최대점수구하기_DFS {
    static int n, m, totalScore, totalTime, answer;
    static int[] score, time;

    static void dfs(int v){
        if(totalTime > m) return;
        if(v==n){
            answer = Math.max(totalScore, answer);
        }
        else {
            totalScore += score[v];
            totalTime += time[v];
            dfs(v+1);
            totalScore -= score[v];
            totalTime -= time[v];
            dfs(v+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        time = new int[n];
        score = new int[n];
        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        dfs(0);
        
        System.out.println(answer);
    }
}
