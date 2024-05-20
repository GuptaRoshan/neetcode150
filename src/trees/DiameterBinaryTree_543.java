package trees;


public class DiameterBinaryTree_543 {

    static int max = 0;

    /**
     * Given a binary tree, you need to compute the length of the diameter of the tree.
     *
     * @param root root node
     * @return diameter of the tree
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(diameterOfBinaryTree(root));
    }

}
