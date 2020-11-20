package com.eric.learn.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.eric.question.Leetcode00104.TreeNode;

public class 二叉树层次遍历 {

	public static void main(String[] args) {
		travelByline(createNode());
	}
	
	private static TreeNode createNode() {
//		TreeNode node = new TreeNode(1);
//		TreeNode left_two_node = new TreeNode(2,new TreeNode(4), new TreeNode(5));
//		TreeNode right_two_node = new TreeNode(3,new TreeNode(6),new TreeNode(7));
//		node.left = left_two_node;
//		node.right = right_two_node;
//		return node;
		
		
		TreeNode node= new TreeNode(0,new TreeNode(2,new TreeNode(1, new TreeNode(5),new TreeNode(1)),
				null),
				
				new TreeNode(4, new TreeNode(3,null, new TreeNode(6)),
						new TreeNode(-1, null, new TreeNode(8)) )
				);
		
		return node;
	}
	
	/**
	 *  遍历二叉树
	 *  连续输出 1234567
	 */
	private static void travel(TreeNode node) {
		if(node == null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			System.out.print(treeNode.val);
			if(treeNode.left !=null) {
				queue.offer(treeNode.left);
			}
			if(treeNode.right !=null) {
				queue.offer(treeNode.right);
			}	
		}
	}
	
	/**
	 *  遍历二叉树
	 *  换行输出 1
	 *          23
	 *          4567
	 */
	private static void travelByline(TreeNode node) {
		if(node == null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(node);
		int height = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode treeNode = queue.poll();
				System.out.print(treeNode.val);
				
				if(treeNode.left !=null) {
					queue.offer(treeNode.left);
				}
				if(treeNode.right !=null) {
					queue.offer(treeNode.right);
				}	
			}
			height++;
			System.out.println(height);
		}
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
