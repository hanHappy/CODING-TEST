package inflearn.section_9;

import java.util.Arrays;
import java.util.Scanner;

public class 씨름선수 {
    public static int solution(Player[] players) {
        int answer = 0;

        Arrays.sort(players);

        int maxWeight = Integer.MIN_VALUE;

        for (Player player : players) {
            if (player.weight > maxWeight) {
                maxWeight = player.weight;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(sc.nextInt(), sc.nextInt());
        }
        System.out.println(solution(players));
    }
}

class Player implements Comparable<Player> {
    int height, weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        return o.height - this.height;
    }

    @Override
    public String toString() {
        return "Player [height=" + height + ", weight=" + weight + "]";
    }

}