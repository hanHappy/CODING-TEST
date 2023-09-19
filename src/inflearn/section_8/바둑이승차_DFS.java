package inflearn.section_8;

import java.util.Scanner;

public class 바둑이승차_DFS {
    static int c;
    static int n;
    static int[] input;
    static int max;
    static int sum;

    public static void dfs(int v){
        if(sum > c) return;
        if(v == n){
            max = Math.max(sum, max);
        }
        else {
            sum += input[v];
            dfs(v+1);
            sum -= input[v];
            dfs(v+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        dfs(0);
        System.out.println(max);
    }
}
