package inflearn.section_5;

import java.util.*;

public class 응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();

        // System.out.println(solution(n, m, input));
    }







    
    
//     public static int solution(int n, int m, int[] input){
//         int answer = 0;

//         Queue<Person> queue = new LinkedList<>();

//         for(int i = 0; i < n; i++){
//             queue.add(new Person(i, input[i]));
//         }

//         a:
//         while(true){
//             Person first = queue.poll();
//             for(Person p : queue){
//                 if(first.priority < p.priority){
//                     queue.add(first);
//                     continue a;
//                 }
//             }
//             answer++;
//             if(first.id == m)
//                 break;
//         }

//         return answer;
//     }
// }
// class Person {
//     int id;
//     int priority;
//     public Person(int id, int priority) {
//         this.id = id;
//         this.priority = priority;
//     }
}
