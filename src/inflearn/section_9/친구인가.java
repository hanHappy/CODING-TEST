package inflearn.section_9;

import java.util.Scanner;

public class 친구인가 {

    static int[] relations;

    static int find(int i) {
        if (relations[i] == i)
            return i;
        else
            return relations[i] = find(relations[i]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb)
            relations[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 학생 관계 저장 배열, 초기화
        relations = new int[n + 1];
        for(int i = 1; i <= n; i++)
            relations[i] = i;

        // 관계 입력
        for (int i = 0; i < m; i++) {
            union(sc.nextInt(), sc.nextInt());
        }

        // 판별
        int student1 = sc.nextInt();
        int student2 = sc.nextInt();
        
        if(find(student1) == find(student2))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
