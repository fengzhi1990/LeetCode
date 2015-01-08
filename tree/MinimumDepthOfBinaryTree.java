package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		System.out.println(minDepth(root));
	}
	public static int minDepth(TreeNode root) {
		int count = 0;
		TreeNode q;
		List<TreeNode> qa = new ArrayList();
		List<TreeNode> qb = new ArrayList();
		if(root == null){
			return count;
		}else{
			qa.add(root);
		}
		while(!qa.isEmpty()){
			count++;
			Iterator<TreeNode> it = qa.iterator();
			while(it.hasNext()){
				q = it.next();
				if(q.left != null){
					qb.add(q.left);
				}
				if(q.right != null){
					qb.add(q.right);
				}
				if(q.left == null && q.right == null){
					return count;
				}
			}
			qa.clear();
			qa.addAll(qb);
			qb = new ArrayList();
		}
		return 0;
    }
}
