package inflearn.section_7;

/*
 * 피보나치 수열
 * 입력은 피보나치 수열의 총 항의 수이다.
 * 총 항 수 n (3<=n<=45)이 입력된다
 * 입력 예제
 * 7
 * 출력 예제
 * 1 1 2 3 5 8 13
 */

public class 피보나치_재귀_메모이제이션 {
    static int[] fibo;
    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        BFS(n);
        for(int x : fibo)
            System.out.print(x + " ");
    }
    public static int BFS(int n){
        if(fibo[n] > 0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else {
            return fibo[n] = BFS(n-2) + BFS(n-1);
        }
    }
}
