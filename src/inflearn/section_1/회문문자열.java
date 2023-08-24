package inflearn.section_1;

import java.util.Scanner;

public class 회문문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long start = System.currentTimeMillis();
        
        System.out.println(solution(sc.next()));

        Long end = System.currentTimeMillis();

        System.out.printf("▶ %dms", end - start);
    }

    public static String solution(String word){
        String reversedWord = new StringBuilder(word).reverse().toString();
        
        if(word.equalsIgnoreCase(reversedWord)) 
            return "YES";
        else 
            return "NO";
    }

    // public static String solution(String word){
    //     String answer = "YES";

    //     word = word.toLowerCase();

    //     int length = word.length();

    //     if(word.length()%2==1) length--;

    //     for(int i = 0; i < length; i++){
    //         if(word.charAt(i) != word.charAt(length-(i+1))){
    //             return "NO";
    //         }
    //     }
    //     return answer;
    // }

    // public static String solution(String word){
    //     word = word.toLowerCase();
    //     int length = word.length();
    //     String lt, rt = "";
    //     if(word.length()%2==0){
    //         lt = word.substring(0, length/2);
    //         rt = word.substring(length/2, length);
    //     } else {
    //         lt = word.substring(0, (length-1)/2);
    //         rt = word.substring(((length+1)/2), length);
    //     }
    //     rt = new StringBuilder(rt).reverse().toString();
    //     if(lt.equals(rt))
    //         return "YES";
    //     else
    //         return "NO";
    // }
}
