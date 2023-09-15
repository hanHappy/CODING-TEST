package inflearn.section_7;

/*
 * 자연수 n이 주어지면 1부터 n까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
 * 
 * 입력 예제
 * 3
 * 출력 예제
 * 1 2 3
 * 1 2
 * 1 3
 * 1
 * 2 3
 * 2
 * 3
 */

public class 부분집합구하기_DFS {
    static int n;
    static int[] ck;
    public static void main(String[] args) {
        n = 3;
        ck = new int[n+1];
        DFS(1);
    }

    public static void DFS(int m){
        if(m == n+1){
            for(int i = 1; i < n+1; i++){
                if(ck[i] == 1)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            ck[m] = 1;
            DFS(m+1);
            ck[m] = 0;
            DFS(m+1);
        }
    }
}