package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinaryTreeLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode lchild = new TreeNode(2);
		TreeNode llchild = new TreeNode(3);
		root.left = lchild;
		root.right = llchild;
		root.left.left = llchild;
		
		System.out.println(levelOrderBottom(root));
		System.out.println(levelOrder(root));
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		TreeNode q;
		List<TreeNode> qa = new ArrayList();
		List<TreeNode> qb = new ArrayList();
		List<List<Integer>> L = new ArrayList();
		List<Integer> Ltemp = new ArrayList();
		if (null == root) {
			return L;
		} else {
			qa.add(root);
		}
		while (!qa.isEmpty()) {
			Iterator<TreeNode> ita = qa.iterator();
			while (ita.hasNext()) {
				q = ita.next();
				Ltemp.add(q.val);
				if (null != q.left) {
					qb.add(q.left);
				}
				if (null != q.right) {
					qb.add(q.right);
				}

			}
			qa.clear();
			qa.addAll(qb);
			qb.clear();
			L.add(0, Ltemp);
			Ltemp = new ArrayList();
		}
		return L;
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		TreeNode q;
		List<TreeNode> qa = new ArrayList();
		List<TreeNode> qb = new ArrayList();
		List<List<Integer>> L = new ArrayList();
		List<Integer> Ltemp = new ArrayList();

		if (null == root) {
			return L;
		} else {
			qa.add(root);
		}
		while (!qa.isEmpty()) {
			Iterator<TreeNode> ita = qa.iterator();
			while (ita.hasNext()) {
				q = ita.next();
				Ltemp.add(q.val);
				if (q.left != null) {
					qb.add(q.left);
				}
				if (q.right != null) {
					qb.add(q.right);
				}
			}
			qa.clear();
			qa.addAll(qb);
			L.add(Ltemp);
			qb = new ArrayList();
			Ltemp = new ArrayList();
		}
		return L;
	}

}
