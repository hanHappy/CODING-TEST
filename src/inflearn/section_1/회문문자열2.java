package inflearn.section_1;

import java.util.Scanner;

public class 회문문자열2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }

    public static String solution(String word){
        String answer = "YES";
        word = word.toLowerCase().replaceAll("[^a-z]", "");
        String reversedWord = new StringBuilder(word).reverse().toString();
        if(!word.equals(reversedWord)){
            return "NO";
        }
        return answer;
    }
}