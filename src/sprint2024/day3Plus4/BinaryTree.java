package sprint2024.day3Plus4;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return lheight + 1;
            else
                return rheight + 1;
        }
    }

    public void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    /**
     * Level order or Breadth first search(BFS)
     */
    void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        //Level order or Breadth first search(BFS)
        System.out.println("level order traversal of above binary tree is ");
        tree.printLevelOrder();
    }
}
