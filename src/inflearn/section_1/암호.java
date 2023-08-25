package inflearn.section_1;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String code = sc.next();

        System.out.println(solution(num, code));
    }

    public static String solution(int num, String codes){
        String answer = "";

        codes = codes.replaceAll("#", "1").replaceAll("\\*", "0");

        for(int i = 0; i < num; i++){
            answer += (char) Integer.parseInt(codes.substring(7*i, 7*(i+1)), 2);
        }

        return answer;
    }
}
