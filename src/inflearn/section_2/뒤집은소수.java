package inflearn.section_2;

import java.util.Scanner;

class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }
        System.out.println(solution(input));
    }
    public static String solution(int[] input){
        String answer = "";

        for(int j = 0; j < input.length; j++){
            int num = 0;
            int length = (int)Math.log10(input[j])+1;
            for(int i = 0; i < length; i++){
                num = num * 10 + input[j] % 10;
                input[j] /= 10;
            }
            input[j] = num;
        }

        boolean[] prime = new boolean[100001];
        prime[0] = prime[1] = true;

        for(int i = 0; i < Math.sqrt(100000); i++){
            if(prime[i]==true) continue;
            for(int j = i*i; j < 100001; j += i){
                prime[j] = true;
            }
        }

        for(int x : input){
            if(prime[x] == false)
                answer += x + " ";
        }

        return answer;
    }
}