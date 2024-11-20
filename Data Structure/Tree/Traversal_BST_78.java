import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    public Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (root.data > key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}

public class Traversal_BST_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int nodes[] = { 14, 10, 2, 12, 11, 13, 18, 16 };
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int nodes[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element:");
            nodes[i] = sc.nextInt();
        }
        BinaryTree b1 = new BinaryTree();
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = b1.insert(root, nodes[i]);
        }
        b1.inorder(root);
        System.out.println();
        b1.preorder(root);
        System.out.println();
        b1.postorder(root);
        System.out.println();
    }
}
