
/*
 * Simple Binary Tree Same Or Not
 */
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
    int index = -1;

    public Node buildTree(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
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
        // if (root == null) {
        // return false;
        // }

        if (root.left == null && root2.left == null) {
            return true;
        }
        if (root.right == null || root2.right == null) {
            return false;
        }
        if (root.data != root2.data) {
            return false;
        }
        return compaire(root.left, root2.left) && compaire(root.right, root2.right);

    }
}

public class Tree_Comparision_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int n = sc.nextInt();

        int nodes[] = new int[n];
        int nodes2[] = new int[n];

        // int nodes[] = { 3, 2, -1, -1, 4, 5, -1, -1, -1 };
        // int nodes2[] = { 3, 2, -1, -1, 4, 5, -1, -1, -1 };
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element First Tree:");
            nodes[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element for Second Tree:");
            nodes2[i] = sc.nextInt();
        }
        BinaryTree b1 = new BinaryTree();
        BinaryTree b2 = new BinaryTree();

        Node root = b1.buildTree(nodes);
        Node root2 = b2.buildTree(nodes2);

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
