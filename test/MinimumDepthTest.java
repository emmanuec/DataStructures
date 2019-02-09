import static org.junit.Assert.*;

import com.eman.leetcode.MinimumDepthTree;
import com.eman.leetcode.TreeNode;

import org.junit.Test;

public class MinimumDepthTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		
		MinimumDepthTree tree = new MinimumDepthTree();
		
		assertTrue(tree.minDepth(root) == 1);
	}

}
