package inflearn.section_7;
/*
 * 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요
 * 각 경로의 길이 = 루트노드에서 말단노드까지 가느 데 이동하는 횟수(간선의 개수)
 *         1
 *      2     3
 *    4   5
 * 가장 짧은 길이는 3번까지의 길이인 1
 */

import java.util.*;

public class 말단노드까지최단경로_BFS {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(bfs(root));
    }

    public static int bfs(Node root) {
        int answer = 0;

        Queue<Node> list = new LinkedList<>();
        list.add(root);

        while (!list.isEmpty()) {
            int length = list.size();
            for (int i = 0; i < length; i++) {
                Node node = list.poll();
                if (node.lt == null && node.rt == null)
                    return answer;
                if (node.lt != null)
                    list.add(node.lt);
                if (node.rt != null)
                    list.add(node.rt);
            }
            answer++;
        }

        return answer;
    }
}

class Node {
    int data;
    Node lt, rt;

    Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}
