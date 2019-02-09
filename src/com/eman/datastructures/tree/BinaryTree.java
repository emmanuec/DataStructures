package com.eman.datastructures.tree;

/***
 * 
 * 
 * 
 * @author emman
 *
 * A tree whose elements have at most 2 children is called a binary tree.
 * Since each element in a binary tree can have only 2 children,
 * we typically name them the left and right child.
 * 
 * This implementation will have smallest numbers to the left
 * and larger numbers to the right.
 */
public class BinaryTree implements Tree {
	private int value;
	private BinaryTree leftNode;
	private BinaryTree rightNode;
	
	public BinaryTree(int value) { this.value = value; };
	
	public void addNode(BinaryTree node)
	{
		
	}

	public int[] getNodesFromLeftToRight()
	{
		return null;
	}
	
}
