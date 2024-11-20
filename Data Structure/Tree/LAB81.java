class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.val = value;
        left = right = null;
    }
}
 class Lab14_C81 {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null)
            return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
public class LAB81 {
    public static void main(String[] args) {
        // Construct the following binary tree
        //          3
        //         / \
        //        9  20
        //           /  \
        //          15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Lab14_C81 bbt = new Lab14_C81();
        boolean result = bbt.isBalanced(root);
        System.out.println("Is the tree balanced? " + result); // Output: Is the tree balanced? true
    }
}
