package inflearn.section_1;

import java.util.Scanner;

public class 가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char chr = sc.next().charAt(0);
        
        System.out.println(solution(word, chr));
    }

    public static int[] solution(String word, char target){
	    int[] answer = new int[word.length()];

        int p = 1000;

        // 정방향
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == target){
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // 역방향
        for(int i = word.length()-1; i >= 0; i--){
            if(word.charAt(i)==target)
                p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    // public static String solution(String word, char chr) {
    //     String answer = "";

    //     List<Integer> list = new ArrayList<>();

    //     for (int i = 0; i < word.length(); i++) {
    //         if (word.charAt(i) == chr)
    //             list.add(i);
    //     }

    //     int index = 0;

    //     for (int i = 0; i < word.length(); i++) {

    //         if(i == list.get(index+1)
    //             && i!= list.get(list.size()-1))
    //             index++;
    //         if(i < list.get(0))
    //             answer += list.get(0)-i;
    //         else if(i == list.get(index))
    //             answer += 0;
    //         else if(i > list.get(list.size()-1))
    //             answer += i - list.get(list.size()-1);
    //         else
    //             answer += Math.min((i-list.get(index)), (list.get(index+1)-i));

    //         answer += " ";
    //     }

    //     return answer;
    // }
}
