package com.eman.leetcode;

import com.eman.leetcode.TreeNode;
/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
	private static int UNBALANCED_FACTOR = 2; // Can be -2 but we will use absolute value.
	
	/**
	 * Go down each node counting down the depth for both
	 * left and right child. If a node is null, it will
	 * be counted as 0.
	 * @param root
	 * @return
	 */
	
	private static int maxDepth(TreeNode node)
	{
		if(node == null)
			return 0;
		
		return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
	}
	
	public boolean isBalanced(TreeNode root)
	{
		if(root == null)
			return true;
		
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		if(Math.abs(leftDepth - rightDepth) >= UNBALANCED_FACTOR)
			return false;
		
		return isBalanced(root.left) && isBalanced(root.right);
    }
}
