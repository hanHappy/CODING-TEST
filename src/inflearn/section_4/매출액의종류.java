package inflearn.section_4;

import java.util.*;

public class 매출액의종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();

        System.out.println(solution(n, k, input));
    }
    public static String solution(int n, int k, int[] input){
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++){
            map.put(input[i], map.getOrDefault(input[i], 0)+1);
        }

        sb.append(map.size()+" ");

        int lt = 0;

        for(int rt = k; rt < n; rt++){
            if(map.get(input[lt])==1) map.remove(input[lt]);
            else map.put(input[lt], map.get(input[lt])-1);

            lt++;

            map.put(input[rt], map.getOrDefault(input[rt], 0)+1);

            sb.append(map.size()+" ");
        }

        return sb.toString();
    }
}
