package Acrofuture;
import java.util.ArrayList;
import java.util.List;

class Solution3 {

    public static void main(String[] args) {
        String text = "가나다abc123가나다abc123가나다abc123가나다abc123가나다acb123";

        System.out.println(solution3(text, 20));

        // System.out.println(text.substring(0, 3));

    }

    public static List<String> solution3(String text, int n) {
        List<String> list = new ArrayList<>();

        int startPoint = 0;
        int count = 0;

        for (int i = 0; i < text.length(); i++) {


            if(count == 19 && isKorean(text.charAt(i))) {
                list.add(text.substring(startPoint, i+1));
                count = 0;
                startPoint = i;
            }

            if (isKorean(text.charAt(i))) { 
                count += 2; 
            }
            else { 
                count++; 
            }

            if(count == 20){
                list.add(text.substring(startPoint, i+1));
                count = 0;
                startPoint = i;
            }

        }

        return list;
    }

    public static boolean isKorean(char ch) {
        return '\uAC00' <= ch && ch <= '\uD7A3';
    }
}