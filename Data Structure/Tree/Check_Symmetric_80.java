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

class Binart_Tree {
    int index = -1;

    public Node insert(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = insert(nodes);
        newNode.right = insert(nodes);
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

    public boolean symmetric(Node root, Node root2) {
        if (root.data != root2.data) {
            return false;
        } else {
            if (root.left != null) {
                return symmetric(root.left, root2.right);
            }
            if (root.right != null) {
                return symmetric(root.right, root2.left);
            }
            return true;
        }
    }
}

public class Check_Symmetric_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();

        int nodes[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element:");
            nodes[i] = sc.nextInt();
        }

        Binart_Tree b1 = new Binart_Tree();
        Node root = b1.insert(nodes);
        b1.inorder(root);
        System.out.println();
        boolean flag = b1.symmetric(root.left, root.right);
        if (flag == true) {
            System.out.println("Trees are Symmetric:");
        } else {
            System.out.println("Trees are not Symmetric:");
        }
    }
}
