package inflearn.section_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        System.out.println(solution(input1, input2));
    }
    public static String solution(String input1, String input2){
        String answer = "YES";

        Map<Character, Integer> map1 = new HashMap<>();

        for(char x : input1.toCharArray())
            map1.put(x, map1.getOrDefault(x, 0)+1);

        for(char x : input2.toCharArray()){
            if(!map1.containsKey(x) || map1.get(x)==0) 
                return "NO";
            map1.put(x, map1.get(x)-1);
        }

        return answer;
    }

    // public static String solution(String input1, String input2){
    //     String answer = "NO";

    //     Map<Character, Integer> map1 = new HashMap<>();

    //     for(char x : input1.toCharArray())
    //         map1.put(x, map1.getOrDefault(x, 0)+1);

    //     Map<Character, Integer> map2 = new HashMap<>();

    //     for(char x : input2.toCharArray())
    //         map2.put(x, map2.getOrDefault(x, 0)+1);

    //     if(map1.equals(map2)) answer = "YES";

    //     return answer;
    // }
}
