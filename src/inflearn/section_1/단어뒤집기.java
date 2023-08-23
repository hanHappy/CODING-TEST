package inflearn.section_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int count = sc.nextInt();
    
        String[] arr = new String[count];

        for(int i = 0; i < count; i++)
            arr[i] = sc.next();

        solution(count, arr);
    }

    public static void solution(int count, String[] arr){
        List<String> answer = new ArrayList<>();
        for(String word : arr){
            String reversedWord = new StringBuilder(word).reverse().toString();
            answer.add(reversedWord);
        }
        for(String word : answer)
            System.out.println(word);
    }
}
