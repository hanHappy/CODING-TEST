package inflearn.section_7;

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