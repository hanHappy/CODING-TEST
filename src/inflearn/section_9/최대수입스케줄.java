package inflearn.section_9;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대수입스케줄 {
    static int solution(Request[] requests) {
        int answer = 0;

        Arrays.sort(requests);

        int max = -1;
        // 최대 기간 찾기
        for (Request request : requests)
            if (request.period > max)
                max = request.period;

        // 최대 기간만큼 반복하면서 list에 n일의 최댓값 add -> n-1일의 최댓값 add -> ...
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());

        int present = 0;
        for(int i = max; i >= 1; i--){
            while(present < requests.length &&i <= requests[present].period){
                list.add(requests[present].pay);
                present++;
            }
            if(!list.isEmpty())
                answer += list.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Request[] requests = new Request[n];
        for (int i = 0; i < n; i++)
            requests[i] = new Request(sc.nextInt(), sc.nextInt());
        System.out.println(solution(requests));
    }
}

class Request implements Comparable<Request> {
    int pay, period;

    public Request(int pay, int period) {
        this.pay = pay;
        this.period = period;
    }

    @Override
    public String toString() {
        return "Request [pay=" + pay + ", period=" + period + "]";
    }

    @Override
    public int compareTo(Request o) {
        if (this.period == o.period)
            return o.pay - this.pay;
        return o.period - this.period;
    }

}