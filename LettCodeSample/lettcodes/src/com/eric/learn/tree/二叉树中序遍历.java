package com.eric.learn.tree;

public class 二叉树中序遍历 {

	public static void main(String[] args) {
		TreeNode node = createNode();
		travel(node);
	}
	
	private static TreeNode createNode() {
		TreeNode node = new TreeNode(1);
		TreeNode left_two_node = new TreeNode(2,new TreeNode(4), new TreeNode(5));
		TreeNode right_two_node = new TreeNode(3,new TreeNode(6),new TreeNode(7));
		node.left = left_two_node;
		node.right = right_two_node;
		return node;
	}
	
	/**
	 *  遍历二叉树
	 */
	private static void travel(TreeNode node) {
		if(node == null) return;
		travel(node.left);
		System.out.print(node.val);
		travel(node.right);
	}
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
