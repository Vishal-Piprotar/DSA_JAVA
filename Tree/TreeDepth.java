package Tree;
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeDepth {
    Node root;

  
    int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
           
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        TreeDepth tree = new TreeDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Maximum depth of the binary tree is: " + tree.maxDepth(tree.root));
    }
}
