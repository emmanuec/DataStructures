import static org.junit.Assert.*;
import com.eman.leetcode.BalancedBinaryTree;
import com.eman.leetcode.TreeNode;

import org.junit.Test;

public class BalancedBinaryTreeTest {

	@Test
	public void test_true() {
		//[1,null,3,2]
		TreeNode node = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		node.right = right;
		BalancedBinaryTree tree = new BalancedBinaryTree();
		assertTrue(tree.isBalanced(node));
	}

	@Test
	public void test_false() {
		//[1,null,3,2]
		TreeNode node = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode rightLeft = new TreeNode(2);
		right.left = rightLeft;
		node.right = right;
		BalancedBinaryTree tree = new BalancedBinaryTree();
		assertTrue(!tree.isBalanced(node));
	}
	
	@Test
	public void test_false_2() {
		//[1,2,2,3,null,null,3,4,null,null,4]
		TreeNode node = new TreeNode(1);
		
		TreeNode left = new TreeNode(2);
		TreeNode leftLeft = new TreeNode(3);
		TreeNode leftLeftLeft = new TreeNode(4);
		left.left = leftLeft;
		leftLeft.left = leftLeftLeft;
		
		TreeNode right = new TreeNode(2);
		TreeNode rightRight = new TreeNode(3);
		TreeNode rightRightRight = new TreeNode(4);
		right.right = rightRight;
		rightRight.right = rightRightRight;
		
		node.left = left;
		node.right = right;
		
		BalancedBinaryTree tree = new BalancedBinaryTree();
		assertTrue(!tree.isBalanced(node));
	}

}
