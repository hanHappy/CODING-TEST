package inflearn.section_2;

import java.util.Scanner;

public class 보이는학생 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] students = new int[count];
        for(int i = 0; i < count; i++)
            students[i] = sc.nextInt();
        System.out.println(solution(students));
    }
    public static int solution(int[] students){
        int answer = 1;

        int max = students[0];

        for(int x : students){
            if(x > max){
                answer++;
                max = x;
            }
        }
        
        return answer;
    }
}
