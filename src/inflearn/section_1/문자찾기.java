package inflearn.section_1;

import java.util.Scanner;

public class 문자찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        char ch = sc.next().charAt(0);

        long startTime = System.currentTimeMillis();

        solution(word, ch);
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Solution function execution time: " + (endTime - startTime) + " milliseconds");
    }

    public static void solution(String word, char ch){
        word = word.toLowerCase();
        char lowerChar = Character.toLowerCase(ch);

        int count = 0;

        for(char comp : word.toCharArray()){
            if(comp == lowerChar)
                count++;
        }

        System.out.println(count);
    }

}