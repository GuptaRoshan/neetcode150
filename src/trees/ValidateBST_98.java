package trees;

public class ValidateBST_98 {
    TreeNode pre = null;

    /**
     * In order traversal of BST is always sorted
     *
     * From the last element check the sorted order increasing order
     *
     * @param root TreeNode
     * @return  boolean
     */
    public boolean inorder(TreeNode root) {
        if (root == null) return true;
        if (!inorder(root.left)) return false;
        if (pre != null && pre.val >= root.val) return false;
        pre = root;
        return inorder(root.right);
    }

    /**
     *
     * Let's pass it to isValidBST(root = 2, minVal = -∞, maxVal = +∞).
     *
     * For root = 2, 2 > -∞ and 2 < +∞. So, the condition satisfies and it will return true.
     * Then it checks the left and right subtrees:
     * For root. Left = 1 with minVal = -∞ and maxVal = 2 (the current node's value), 1 > -∞ and 1 < 2. So, it returns true.
     * For root. Right = 3 with minVal = 2 and maxVal = +∞, 3 > 2 and 3 < +∞. So, it returns true as well.
     * As all return true, the entire function isValidBST ends up returning true, meaning the tree is a valid BST.
     *
     * @param root TreeNode
     * @param minVal long
     * @param maxVal long
     * @return  boolean
     */
    public boolean postOrder(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return postOrder(root.left, minVal, root.val) && postOrder(root.right, root.val, maxVal);
    }


    public boolean isValidBST(TreeNode root) {
        //return inorder(root);
        return postOrder(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        ValidateBST_98 validateBST98 = new ValidateBST_98();

        TreeNode node10 = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode root1 = new TreeNode(15, node10, node20);
        System.out.println(validateBST98.isValidBST(root1));

        System.out.println("====================================");

        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node4 = new TreeNode(4, node3, node6);
        TreeNode node1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(5, node1, node4);
        //System.out.println(validateBST98.isValidBST(root2));
    }


}
