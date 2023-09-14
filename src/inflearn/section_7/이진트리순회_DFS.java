package inflearn.section_7;

/*
 * 이진트리에 대해 전위, 중위, 후위 순회를 출력하세요.
 * 
 *          1
 *      2       3
 *   4    5  6    7
 * 
 * 전위 순회 : 1 2 4 5 3 6 7
 * 중위 순회 : 4 2 5 1 6 3 7
 * 후위 순회 : 4 5 2 6 7 3 1
 */

public class 이진트리순회_DFS {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }
    public static void DFS(Node root){
        if(root==null) return;
        else {
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }
}

class Node {
    int data;
    Node lt, rt;
    public Node(int data){
        this.data = data;
        lt = rt = null;
    }
}
