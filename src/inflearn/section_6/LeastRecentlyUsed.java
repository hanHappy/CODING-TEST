package inflearn.section_6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        for(int x : solution(s, n, input))
            System.out.print(x + " ");
    }
    public static int[] solution(int s, int n, int[] input){
        int[] answer = new int[s];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(deque.contains(input[i])){
                deque.remove(input[i]);
                deque.addFirst(input[i]);
            }
            else{
                if(deque.size()==s){
                    deque.removeLast();
                    deque.addFirst(input[i]);
                }
                else
                    deque.addFirst(input[i]);
            }
        }
        for(int i = 0; i < s; i++)
            answer[i] = deque.poll();
        return answer;
    }
}
