package com.eric.question;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 */
public class Leetcode0094 {

	public static void main(String[] args) {
		

	}
      //	Input: root = [1,null,2,3]
     //			Output: [1,3,2]
	//  中序遍历 二叉树 （左-根-右）
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
    	if(root ==null) return result;
    	while (root.left !=null) {
    			
    		
		}
    	return result;
    }
	
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	         this.right = right;
	      }
	 }
	

}



