package Acrofuture;
import java.util.Arrays;

class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution1(new int[]{6, 10, 2}));
    }

    public static String solution1 (int[] numbers){
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();

        for(int number : numbers){
            sb.append(Integer.toString(number));
        }
        
        return sb.toString();
    }
}