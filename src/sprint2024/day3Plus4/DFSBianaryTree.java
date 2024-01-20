package sprint2024.day3Plus4;

/**
 * DFS of binary tree can be implemented using preorder, inorder and post order tree traversal techniques.
 */
public class DFSBianaryTree {
    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        DFSBianaryTree dfsTree = new DFSBianaryTree();
        System.out.println("InOrder traversal of above Binary tree is ");
        dfsTree.inOrder(tree.root);
        System.out.println();
        System.out.println("PreOrder traversal of above Binary tree is ");
        dfsTree.preOrder(tree.root);
        System.out.println();
        System.out.println("PostOrder traversal of above Binary tree is ");
        dfsTree.postOrder(tree.root);


    }
}
