package inflearn.section_6;

import java.util.*;

public class 중복확인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        System.out.println(solution(n, input));
    }
    public static char solution(int n, int[] input) {
        char answer = 'D';

        Set<Integer> set = new HashSet<>();

        for(int x : input)
            set.add(x);
        
        if(n == set.size())
            return 'U';

        return answer;
    }
}
