package Tree;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class IdenticalBinaryTree {
    Node root;

    boolean isIdentical(Node a, Node b) {
        // Empty he root node ya nhi
        if (a == null && b == null) {
            return true;
        }

        // jo part hamara non empty he uske liye
        if (a != null && b != null) {
            return (a.data == b.data && isIdentical(a.left, b.left) && isIdentical(a.right, b.right));
        }

        return false;
    }

    public static void main(String[] args) {
        IdenticalBinaryTree tree1 = new IdenticalBinaryTree();
        IdenticalBinaryTree tree2 = new IdenticalBinaryTree();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);

        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);

        System.out.println(tree1.isIdentical(tree1.root, tree2.root));
    }

}