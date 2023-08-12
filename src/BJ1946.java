import java.io.*;
import java.util.*;

public class BJ1946 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/sangm/OneDrive/\uBC14\uD0D5 \uD654\uBA74/dev/Coding-Test/res/1946.csv"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine()); // 2

        // 정답 문자열
        StringBuilder sb = new StringBuilder();

        while(caseNum-->0){
            int applicantsNum = Integer.parseInt(br.readLine());
            
            ArrayList<Applicant> list = new ArrayList<>();

            for(int i = 0; i < applicantsNum; i++) {

                // 읽어들인 문자열을 구분자로 구분하여 토큰화하는 Class
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int docsRank = Integer.parseInt(st.nextToken());
                int interviewRank = Integer.parseInt(st.nextToken());

                list.add(new Applicant(docsRank, interviewRank));

            }

            // 서류 순위 기준 오름차순 정렬
            Collections.sort(list);

            int passNum = 1;
            int minInterviewRank = list.get(0).interviewRank;

            for(int i = 0; i < applicantsNum -1; i++) {
                if(list.get(i+1).interviewRank < minInterviewRank){
                    minInterviewRank = list.get(i+1).interviewRank;
                    passNum++;
                }

            }

            sb.append(passNum + "\n");

        }

        br.close();

        System.out.println(sb);

    }

    // static nested class
    static class Applicant implements Comparable<Applicant>{
        int docsRank;
        int interviewRank;

        public Applicant(int docsRank, int interviewRank){
            this.docsRank = docsRank;
            this.interviewRank = interviewRank;
        }

        @Override
        public int compareTo(Applicant o) {

            return this.docsRank - o.docsRank;
        }

        
    }
}
