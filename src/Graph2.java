import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int value){
        this.data = value;
        lt = rt = null;
    }
}
public class Graph2 {

    Node2 node;
    public void BFS(Node2 node){
        Queue<Node2> que = new LinkedList<>();
        que.offer(node);
        int level = 0;
        while(!que.isEmpty()){
            int len = que.size();
            System.out.print(level+" : ");
            for(int i = 0; i <len; i++){
                Node2 node2 = que.poll();
                System.out.print(node2.data);
                if(node2.lt != null){
                    que.offer(node2.lt);
                }
                if(node2.rt != null){
                    que.offer(node2.rt);
                }
            }
            level++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Graph2 tree = new Graph2();
        tree.node = new Node2(1);
        tree.node.lt = new Node2(2);
        tree.node.rt = new Node2(3);
        tree.node.lt.lt = new Node2(4);
        tree.node.lt.rt = new Node2(5);
        tree.node.rt.lt = new Node2(6);
        tree.node.rt.rt = new Node2(7);
        tree.BFS(tree.node);
        //System.out.println(tree.node.lt.data );
    }
}
