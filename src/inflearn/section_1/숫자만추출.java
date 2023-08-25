package inflearn.section_1;

import java.util.Scanner;

public class 숫자만추출{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }
    public static int solution(String word){
        int answer = -1;

        String tmp = "";

        for(int i = 0; i < word.length(); i++){
            if(!Character.isAlphabetic(word.charAt(i)))
                tmp += word.charAt(i);
        }
        answer = Integer.parseInt(tmp);

        return answer;
        

    }

    // public static int solution(String word){
    //     int answer = -1;

    //     StringBuilder sb = new StringBuilder();

    //     for(int i = 0; i < word.length(); i++){
    //         if(!Character.isAlphabetic(word.charAt(i)))
    //             sb.append(word.charAt(i));
    //     }
    //     answer = Integer.parseInt(sb.toString());

    //     return answer;
    // }
}