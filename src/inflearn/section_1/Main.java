package inflearn.section_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long start = System.currentTimeMillis();
        System.out.println(solution(sc.next()));
        Long end = System.currentTimeMillis();

        System.out.printf("소요 시간 : %dms ", end-start);

    }

    // 문자열 + 연산
    public static String solution(String word){
        String answer = "";
        for(int i = 0; i < word.length(); i++){
            if(word.indexOf(word.charAt(i))==i)
                answer += word.charAt(i);
        }
        return answer;
    }

    // StringBuilder 사용
    // public static String solution(String word){
    //     String answer = "";
    //     StringBuilder sb = new StringBuilder();
    //     for(int i = 0; i < word.length(); i++){
    //         String chr = word.substring(i, i+1);
    //         int firstFound = word.indexOf(chr);
    //         if(firstFound == i)
    //             sb.append(chr);
    //     }
    //     answer = sb.toString();
    //     return answer;
    // }
}
