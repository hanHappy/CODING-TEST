package inflearn.section_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input1 = new int[n];
        for(int i = 0; i < n; i++) 
            input1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] input2 = new int[m];
        for(int i = 0; i < m; i++) 
            input2[i] = sc.nextInt();
        System.out.println(solution(input1, input2));
        
    }
    public static String solution(int[] input1, int[] input2){
        String answer = "";
        List<Integer> list = new ArrayList<>();
        for(int x : input1) list.add(x);
        for(int x : input2) list.add(x);

        Collections.sort(list);

        for(int x : list) answer += x + " ";
        return answer;
    }
}
