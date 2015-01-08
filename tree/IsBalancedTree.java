package tree;

public class IsBalancedTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		System.out.println(isBalanced(root));

	}

	public static boolean isBalanced(TreeNode root) {
		if ((root == null) || ((root.left == null) && (root.right == null))) {
			return true;
		}
		if ((getHeight(root.left) - getHeight(root.right) <= 1)
				&& (getHeight(root.left) - getHeight(root.right) >= -1)) {
			return isBalanced(root.left) && isBalanced(root.right);
		}
		return false;
	}

	public static int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		if ((root.left == null) && (root.right == null)) {
			return 1;
		}
		if ((root.left != null) && (root.right == null)) {
			return 1 + getHeight(root.left);
		}
		if ((root.right != null) && (root.left == null)) {
			return 1 + getHeight(root.right);
		}
		if (getHeight(root.left) >= getHeight(root.right)) {
			return 1 + getHeight(root.left);
		} else {
			return 1 + getHeight(root.right);
		}
	}
}
