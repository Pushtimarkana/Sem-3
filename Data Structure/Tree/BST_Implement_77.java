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

class BinarySearchTree {
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

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else if (root.data == key) {

            // Case 1:Don't have any child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2:Node have two child
            if (root.left != null && root.right != null) {
                Node is = inorderSuccessor(root.right);
                root.data = is.data;
                root.right = delete(root.right, is.data);
            }

            // Case 3:Node have one child
            else {
                if (root.left == null) {
                    return root.right;
                } else {
                    return root.left;
                }
            }
        }
        return root;
    }

    public Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

public class BST_Implement_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int nodes[] = { 14, 10, 2, 12, 11, 13, 18, 16 };
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();

        int nodes[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element:");
            nodes[i] = sc.nextInt();
        }

        BinarySearchTree b1 = new BinarySearchTree();
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = b1.insert(root, nodes[i]);
        }
        b1.inorder(root);
        System.out.println();
        boolean flag = b1.search(root, 7);
        if (flag == true) {
            System.out.println("Node Found:");
        } else {
            System.out.println("Node not Found:");
        }
        b1.delete(root, 10);
        b1.inorder(root);
    }
}
