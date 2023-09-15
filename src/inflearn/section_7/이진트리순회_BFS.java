package inflearn.section_7;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 아래 그림과 같은 이진트리의 레벨탐색을 연습하세요
 * 
 *          1
 *      2       3
 *   4    5  6    7
 * 
 * 레벨 탐색 순회 출력
 * 1 
 * 2 3 
 * 4 5 6 7 
 */

public class 이진트리순회_BFS {
    static Node root;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        BFS(root);
    }

    public static void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int i = 0; i < length; i++){
                Node node = queue.poll();
                System.out.print(node.data);
                if(node.lt != null) queue.add(node.lt);
                if(node.rt != null) queue.add(node.rt);
            }
            System.out.println();
        }
    }
}

class Node {
    int data;
    Node lt, rt;
    public Node(int data){
        this.data = data;
    }
}