package inflearn.section_8;

import java.util.Scanner;

public class 순열구하기_DFS {
    static int n, m;
    static int[] input;
    static boolean[] check;
    static int[] answer;

    public static void dfs(int v){
        if(v == m){
            for(int x : answer)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = 0; i < n; i++){
                if(check[i])
                    continue;
                
                answer[v] = input[i];
                check[i] = true;
                dfs(v+1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        input = new int[n];
        check = new boolean[n];
        answer = new int[m];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        dfs(0);
    }
}
