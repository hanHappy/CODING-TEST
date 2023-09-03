package inflearn.section_4;

import java.util.*;

public class 모든아나그램찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(solution(s, t));
    }
    public static int solution(String s, String t){
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        for(int i = 0; i < t.length(); i++){
            map.put(sArr[i], map.getOrDefault(sArr[i], 0)+1);
        }

        Map<Character, Integer> compMap = new HashMap<>();
        char[] tArr = t.toCharArray();
        for(int i = 0; i < t.length(); i++){
            compMap.put(tArr[i], compMap.getOrDefault(tArr[i], 0)+1);
        }

        if(map.equals(compMap)) answer++;
        
        int lt = 0;

        for(int rt = t.length(); rt < s.length(); rt++){
            if(map.get(sArr[lt])==1) map.remove(sArr[lt]);
            else map.put(sArr[lt], map.get(sArr[lt])-1);

            lt++;
            
            map.put(sArr[rt], map.getOrDefault(sArr[rt], 0)+1);
            
            if(map.equals(compMap)) answer++;
        }
        
        return answer;
    }
}
