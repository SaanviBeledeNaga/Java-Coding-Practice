/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) 
    {
        Queue<TreeNode> pathqueue = new LinkedList<>();
        Queue<Integer> pathsumqueue = new LinkedList<>();
        pathqueue.add(root);
        pathsumqueue.add(root.val);
        int res = 0;
        while(!pathqueue.isEmpty())
        {
            TreeNode node = pathqueue.poll();
            int nodeval = pathsumqueue.poll();
            if((node.left == null) && (node.right==null))
            {
                res+=nodeval;
            }
            if(node.left!=null)
            {
                pathqueue.add(node.left);
                pathsumqueue.add(nodeval * 10 + node.left.val);
            }
            if(node.right!=null)
            {
                pathqueue.add(node.right);
                pathsumqueue.add(nodeval*10+node.right.val);
            }
        }
        return res;
    }
}