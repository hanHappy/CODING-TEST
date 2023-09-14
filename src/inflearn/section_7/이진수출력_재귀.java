package inflearn.section_7;

/*
 * 재귀함수를 이용한 이진수 출력
 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
 * 입력 예제
 * 11
 * 출력 예제
 * 1011
 */

public class 이진수출력_재귀 {
    public static void main(String[] args) {
        BFS(11);
    }
    public static void BFS(int n){
        if(n==0) return;
        else {
            BFS(n/2);
            System.out.print(n%2);
        }
    }
}
