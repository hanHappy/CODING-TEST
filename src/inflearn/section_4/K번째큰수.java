package inflearn.section_4;

import java.util.*;

public class K번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];

        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();

        System.out.println(solution(n, k, input));
    }
    public static int solution(int n, int k, int[] input){
        int answer = -1;
        Set<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int l = j+1; l < n; l++){
                    tSet.add(input[i] + input[j] + input[l]);
                }
            }
        }
        
        int count = 0;
        for(int x : tSet){
            count++;
            if(count == k)
                return x;
        }

        return answer;
    }
}
