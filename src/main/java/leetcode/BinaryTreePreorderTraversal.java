package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode () {}

		TreeNode(int val) { this.val = val; }

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	List<Integer> list = new ArrayList<>();

	public List<Integer> preorderTraversal(TreeNode root) {
		traverseRead(root);
		return list;
	}

	public void traverseRead(TreeNode root) {
		if (root == null) {
			return;
		}

		list.add(root.val);
		traverseRead(root.left);
		traverseRead(root.right);
	}
}

