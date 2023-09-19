package inflearn.section_8;

import java.util.Scanner;

public class 중복순열_DFS {
    static int n, m;
    static int[] arr;

    public static void dfs(int v){
        if(v == m){
            for(int x : arr)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++){
                arr[v] = i;
                dfs(v+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(0);
    }
}
