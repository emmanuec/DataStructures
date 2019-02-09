package com.eman.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MinimumDepthTree {
    class TreeNodeState {
        private TreeNodeState left;
        private TreeNodeState right;
        private boolean leftVisited;
        private boolean rightVisited;
        private int depth;
        public TreeNodeState(TreeNode node)
        {
            this.left = node == null ? null : new TreeNodeState(node.left);
            this.right = node == null ? null : new TreeNodeState(node.right);
            this.leftVisited = false;
            this.rightVisited = false;
            this.depth = 0;
        }
        public TreeNodeState getLeft() { return this.left;}
        public TreeNodeState getRight() { return this.right;}
        public boolean isLeftVisited() { return this.leftVisited;}
        public void setLeftVisited(boolean isVisited) { this.leftVisited = isVisited;}
        public boolean isRightVisited() { return this.rightVisited;}
        public void setRightVisited(boolean isVisited) { this.rightVisited = isVisited;}
        public void setDepth(int depth) { this.depth = depth;}
        public int getDepth() { return depth;}
    }
    
    private void adjustQueue(Queue<TreeNodeState> treeQueue)
    {
        for(int index = 0; index < treeQueue.size(); index++)
        {
            if(treeQueue.poll() == null)
                return;

            if(treeQueue.peek().isLeftVisited() == false || treeQueue.peek().isRightVisited() == false)
                return;
        }
    }
    
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        TreeNodeState rootState = new TreeNodeState(root);
        rootState.setDepth(0);
        TreeNodeState cursor = rootState;
        Queue<TreeNodeState> treeQueue = new LinkedList<>();
        treeQueue.add(rootState);
        
        int min = 0;
        do
        {
            if(cursor.isLeftVisited() == false)
            {
                if(cursor.getLeft() != null)
                {
                    cursor.setLeftVisited(true);
                    cursor.getLeft().setDepth(cursor.getDepth() + 1);
                    treeQueue.add(cursor.getLeft());
                    cursor = cursor.left;
                    continue;
                }
                else
                {
                    if(min > cursor.getDepth())
                        min = cursor.getDepth();
                    adjustQueue(treeQueue);
                    cursor = treeQueue.peek();
                    continue;
                }
            }
            
            if(cursor.isRightVisited() == false)
            {
                if(cursor.getRight() != null)
                {
                    cursor.setRightVisited(true);
                    cursor.getRight().setDepth(cursor.getDepth() + 1);
                    treeQueue.add(cursor.getRight());
                    cursor = cursor.right;
                    continue;
                }
                else
                {
                    if(min > cursor.getDepth())
                        min = cursor.getDepth();
                    adjustQueue(treeQueue);
                    cursor = treeQueue.peek();
                    continue;
                }
            }
        } while(treeQueue.size() > 0);
        
    return min;
    }
}