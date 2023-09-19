package inflearn.section_8;

import java.util.Arrays;
import java.util.Scanner;

public class 합이같은부분집합_DFS {

    static int n;
    static int[] input;
    static int sum;
    static int calc;
    static String answer = "NO";
    static boolean flag = false;

    public static void dfs(int v) {
        if(flag) return;
        if(calc > sum/2) return;
        if(v == n){
            if(calc == sum/2 && sum%2==0){
                answer = "YES";
                flag = true;
            }
        }
        else {
            calc += input[v];
            dfs(v+1);
            calc -= input[v];
            dfs(v+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        input = new int[n];
        for (int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        sum = Arrays.stream(input).sum();
        dfs(0);
        System.out.println(answer);
    }

}
