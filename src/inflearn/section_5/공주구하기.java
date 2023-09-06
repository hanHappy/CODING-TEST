package inflearn.section_5;

import java.util.*;

public class 공주구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.print(solution(n, k));
    }

    public static int solution(int n, int k){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            queue.add(i+1);
            
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < k; j++){
                int head = queue.poll();
                if(j == k-1)
                    break;
                queue.add(head);
            }
        }


        return queue.poll();
    }

}
