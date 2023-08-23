package inflearn.section_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        solution(sc.nextLine());
    }

    public static void solution(String input){
        String[] arr = input.split(" ");

        int max = -1;
        String answer = "";

        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
                answer = arr[i];
            }
        }
        System.out.println(answer);
    }
}
