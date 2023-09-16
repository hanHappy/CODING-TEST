package inflearn.section_7;

/*
 * 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요
 * 각 경로의 길이 = 루트노드에서 말단노드까지 가느 데 이동하는 횟수(간선의 개수)
 *         1
 *      2     3
 *    4   5
 * 가장 짧은 길이는 3번까지의 길이인 1
 */

public class 말단노드까지최단경로_DFS {
    static Node root;
    static int min = 100;
    static int count;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(dfs(0, root));
    }

    public static int dfs(int count, Node root) {
        if(root.lt == null && root.rt == null)
            return count;
        else
            return Math.min(dfs(count+1, root.lt), dfs(count+1, root.rt));
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
