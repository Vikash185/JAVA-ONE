
import java.util.*;

public class binaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class bt {
        static int index = -1;

        public static Node createTree(int arr[]) {
            index++;
            if (arr[index] == -1) {
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.left = createTree(arr);
            newNode.right = createTree(arr);
            return newNode;
        }
    }

    // PreOrder Traversal
    public static void preOrder(Node root) {
        if (root == null) {
            // System.out.println(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // InOrder Traversal
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // CountNode
    public static int CountNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = CountNode(root.left);
        int rightNode = CountNode(root.right);
        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1, 6, -1, -1 };
        bt tree = new bt();
        Node root = tree.createTree(arr);
        // System.out.println(root.data);
        System.out.println(CountNode(root));
        preOrder(root);
        inOrder(root);
        // System.out.println("PreOrder Traversal:");
        // preOrder(root);
        // System.out.println("\nInOrder Traversal:");
        // inOrder(root);
    }

}
