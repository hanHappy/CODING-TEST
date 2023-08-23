package inflearn.section_1;

import java.util.Scanner;

public class 문자찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        String comp = sc.next();

        System.out.println(solution(word, comp));
    }

    // 발전 정답
    // replace 사용
    // 문자열 길이 비교
    public static int solution(String word, String chr){
        int answer;
        word = word.toLowerCase();
        chr = chr.toLowerCase();
        answer = word.length() - word.replace(chr, "").length();
        return answer;
    }
    
    
    // 강의 정답
    public static void solution1(String word, char ch){
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