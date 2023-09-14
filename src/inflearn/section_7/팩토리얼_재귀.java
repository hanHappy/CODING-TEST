package inflearn.section_7;

/*
 * 팩토리얼
 * 자연수 N이 입력되면 N!을 구하는 프로그램을 작성하세요
 * 입력 예제
 * 5
 * 출력 예제
 * 120
 */

public class 팩토리얼_재귀 {
    public static void main(String[] args) {
        System.out.println(BFS(5));
    }
    public static int BFS(int n){
        if(n == 1) return 1;
        else return n * BFS(n-1);
    }
}
