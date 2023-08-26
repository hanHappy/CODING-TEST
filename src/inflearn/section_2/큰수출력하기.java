package inflearn.section_2;

import java.util.Scanner;

class 큰수출력하기 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] numbers = new int[count];
        for(int i = 0; i < count; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println(solution(count, numbers));

    }

    public static String solution(int count, int[] numbers){
        String answer = "";

        answer += numbers[0] + " ";

        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i] < numbers[i+1])
                answer += numbers[i+1] + " ";
        }

        return answer;
    }

}