package inflearn.section_3;

import java.util.*;

public class 공통원소구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] input1 = new int[n];
        for (int i = 0; i < n; i++)
            input1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] input2 = new int[m];
        for (int i = 0; i < m; i++)
            input2[i] = sc.nextInt();

        System.out.println(solution(input1, input2));
    }

    public static String solution(int[] input1, int[] input2) {
        String answer = "";

        Arrays.sort(input1);
        Arrays.sort(input2);

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < input1.length && j < input2.length) {

            if(input1[i] == input2[j]){
                list.add(input1[i]);
                i++;
                j++;
            }
            else if(input1[i] > input2[j])
                j++;
            else if(input1[i] < input2[j])
                i++;
        }

        for(int x : list)
            answer += x + " ";

        return answer;
    }

}
