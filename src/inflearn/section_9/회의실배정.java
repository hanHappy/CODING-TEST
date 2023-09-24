package inflearn.section_9;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실배정 {
    static int solution(Time[] times) {
        Arrays.sort(times);

        int answer = 0;
        int n = times.length;

        int endTime = -1;
        for (Time time : times) {
            if (time.start >= endTime) {
                endTime = time.end;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] times = new Time[n];
        for (int i = 0; i < n; i++)
            times[i] = new Time(sc.nextInt(), sc.nextInt());

        System.out.println(solution(times));
    }
}

class Time implements Comparable<Time> {
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end)
            return this.start - o.start;
        else
            return this.end - o.end;
    }

}
