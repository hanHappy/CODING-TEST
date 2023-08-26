package inflearn.section_2;

import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] A = new int[count];
        int[] B = new int[count];
        for(int i = 0; i < count; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < count; i++){
            B[i] = sc.nextInt();
        }
        solution(A, B);
    }
    public static void solution(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            switch (a[i] - b[i]) {
                case 1:
                case -2:
                    System.out.println("A");
                    break;
                case -1:
                case 2:
                    System.out.println("B");
                    break;
                case 0:
                    System.out.println("D");
                    break;
            }
        }
    }
}
