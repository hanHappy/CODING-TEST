package Acrofuture;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

class Solution2 {
    public static void main(String[] args) throws IOException{
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("C:\\Users\\sangm\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\dev\\Coding-Test\\res\\data.json");

        // JSON 데이터를 Java 객체 리스트로 변환
        List<User> users = mapper.readValue(file, new TypeReference<List<User>>(){});

        Long userNums = users.stream()
                            .count();

        System.out.println(userNums);


        double avg = users.stream()
                       .mapToDouble(user -> user.getScore())
                       .sum() / userNums;

        System.out.println(avg);

        // List<User> high = users.stream()
        //                 .max(Comparator.comparingInt(User::getScore));
        // System.out.println(high);

    }

    public String solution2_1(){

        

        return "";
    }

}
