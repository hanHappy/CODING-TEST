package inflearn.section_5;

import java.util.*;

public class 교육과정설계 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String required = sc.next();
        String plan = sc.next();
        System.out.println(solution(required, plan));
    }
    public static String solution(String required, String plan){
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for(char x : required.toCharArray())
            queue.add(x);

        for(char x : plan.toCharArray()){
            if(x == queue.peek())
                queue.poll();
            if(queue.isEmpty())
                return answer;
        }
        if(!queue.isEmpty())
            return "NO";

        return answer;
    }
}
