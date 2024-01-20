package sprint2024.day3Plus4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BreadthFirstTraversalUsingQueue {

    void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root != null) {
                queue.add(root.left);
                queue.add(root.right);
                System.out.print(root.data + " ");
            }
        }
    }

    public static void main(String[] arg) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        BreadthFirstTraversalUsingQueue bfsTrabersal = new BreadthFirstTraversalUsingQueue();
        bfsTrabersal.printLevelOrder(tree.root);

    }


}
