package inflearn.section_9;

import java.util.*;

public class 결혼식 {
    static int solution(Time[] times) {
        int answer = 0;

        // two pointer
        // 1. 도착 시간 기준 오름차순 정렬
        Arrays.sort(times);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] times = new Time[2 * n];
        for (int i = 0; i < times.length; i++)
            if (i % 2 == 0)
                times[i] = new Time(sc.nextInt(), 's');
            else
                times[i] = new Time(sc.nextInt(), 'e');

        System.out.println(solution(times));
    }
}

class Time implements Comparable<Time> {
    int time;
    char status;

    public Time(int time, char status) {
        this.time = time;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Time [time=" + time + ", status=" + status + "]";
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time)
            return this.status - o.status;
        else
            return this.time - o.time;
    }

}
