package inflearn.section_7;

import java.util.Scanner;

/*
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요
 * 입력 예제 - 3
 * 출력 예제 - 1 2 3
 */

public class 재귀함수_스택프레임 {
    public static void main(String[] args) {
        DFS(3);
    }   
    public static void DFS(int n){
        if(n==0) return;
        else {
            System.out.print(n + " ");
            DFS(n-1);
        }
    }
}
