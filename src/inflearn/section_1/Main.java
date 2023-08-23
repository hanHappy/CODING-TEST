package inflearn.section_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));

    }

    public static String solution(String word){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            String chr = word.substring(i, i+1);
            int firstFound = word.indexOf(chr);
            if(firstFound == i)
                sb.append(chr);
        }
        answer = sb.toString();
        return answer;
    }
}
