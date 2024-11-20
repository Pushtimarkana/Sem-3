import java.util.*;
// BST Same or Not
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
            Node n = new Node(key);
            return n;
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

    public boolean compaire(Node root, Node root2) {
        if (root.data != root2.data) {
            return false;
        } else if (root.left != null && root2.left != null) {
            return compaire(root.left, root2.left);
        } else if (root.right != null && root2.right != null) {
            return compaire(root.right, root2.right);
        }
        return true;
    }
}

public class Tress_SameOrNot_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();

        int nodes[] = new int[n];
        int nodes2[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element:");
            nodes[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element second tree:");
            nodes2[i] = sc.nextInt();
        }
        BinaryTree b1 = new BinaryTree();
        BinaryTree b2 = new BinaryTree();
        Node root = null;
        Node root2 = null;
        for (int i = 0; i < nodes.length; i++) {
            root = b1.insert(root, nodes[i]);
            root2 = b2.insert(root2, nodes2[i]);
        }
        b1.inorder(root);
        System.out.println();
        b2.inorder(root2);
        System.out.println();
        boolean flag = b1.compaire(root, root2);
        if (flag == true) {
            System.out.println("Trees are Same:");
        } else {
            System.out.println("Trees are not Same:");
        }
    }
}
