package inflearn.section_8;

import java.util.Scanner;

public class 조합의경우수_메모이제이션 {
    static int[][] store;

    public static int dfs(int n, int r){
        if(store[n][r] > 0) return store[n][r];
        if(n == r) return 1;
        if(r == 1) return n;
        
        return store[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        store = new int[n+1][n+1];
        System.out.println(dfs(n, r));
    }
}
