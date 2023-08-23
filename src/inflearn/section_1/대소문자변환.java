package inflearn.section_1;

import java.util.Scanner;

public class 대소문자변환 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input1 = in.next();

        solution(input1);
    }

    public static void solution(String input){

        StringBuilder sb = new StringBuilder();

        for(char ch : input.toCharArray()){
            if(65 <= ch && ch <= 90)
                sb.append((char)(ch+32));
            else
                sb.append((char)(ch-32));
        }

        System.out.println(sb.toString());
    }

}
