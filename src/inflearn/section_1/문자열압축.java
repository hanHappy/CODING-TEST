package inflearn.section_1;

import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(solution(sc.next()));
    }
    public static String solution(String word){
        String answer = "";

        answer += word.charAt(0);
        
        int duplicateCount = 1;
        
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i-1))
                duplicateCount++;
            else if(duplicateCount==1)
                answer += word.charAt(i);
            else{
                answer += duplicateCount;
                answer += word.charAt(i);
                duplicateCount = 1;
            }
            if((i == word.length()-1) && duplicateCount != 1)
                answer += duplicateCount;
        }

        return answer;
    }
}
