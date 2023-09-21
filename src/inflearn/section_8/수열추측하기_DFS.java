package inflearn.section_8;

import java.util.Scanner;

public class 수열추측하기_DFS {
    static int n, f;
    static int[][] store;
    static int[] count, arr, answer;
    static boolean[] check;
    static boolean flag = false;

    public static void dfs(int lv){
        if(flag) return;
        if(lv == n){
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += answer[i] * count[i];
                if(sum > f) return;
            }
            if(sum == f)
                flag = true;
        } else {
            for(int i = 0; i < n; i++){
                if(!check[i]){
                    check[i] = true;
                    answer[lv] = arr[i];
                    dfs(lv+1);
                    if(flag) return;
                    check[i] = false;
                }
            }
        }
    }

    public static int calculate(int n, int r){
        if(store[n][r] > 0) return store[n][r];
        if(r == 0 || n == r) return 1;
        else if(r == 1 || n-r == 1) return n;
        else
            return store[n][r] = calculate(n-1, r-1) + calculate(n-1, r);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        
        store = new int[n][n];
        count = new int[n];
        for(int i = 0; i < n; i++)
            count[i] = calculate(n-1, i);
            
        arr = new int[n];
        answer = new int[n];
        check = new boolean[n];

        for(int i = 0; i < n; i++)
            arr[i] = i+1;
        
        dfs(0);

        for(int x : answer)
            System.out.print(x + " ");
    }
}
