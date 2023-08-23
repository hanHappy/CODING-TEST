package inflearn.section_1;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        System.out.println(solution(word));
        
    }
    public static String solution(String word){
        int lp = 0, rp = word.length()-1;
        char[] chArr = word.toCharArray();
        while(lp < rp){
            if(!Character.isAlphabetic(chArr[lp])){
                lp++;
                rp--;
                continue;
            }
            char tmp;
            tmp = chArr[lp];
            chArr[lp] = chArr[rp];
            chArr[rp] = tmp;
            
            lp++;
            rp--;
        }
        
        return String.valueOf(chArr);
    }
}
