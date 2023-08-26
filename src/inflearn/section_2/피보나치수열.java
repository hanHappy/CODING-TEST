package inflearn.section_2;

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = solution(sc.nextInt());
        for(int x : arr)
            System.out.print(x + " ");
    }
    public static int[] solution(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < n; i++)
            arr[i] = arr[i-2] + arr[i-1];
        return arr;
    }
}
