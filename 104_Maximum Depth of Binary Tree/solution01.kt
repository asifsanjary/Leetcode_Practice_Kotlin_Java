/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Time Complexity: O(n) where n is the number of the nodes
 * Space Complexity: O(d) where d is the maximum depth which will be 
 * equal to the recursion stack size
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0;
        val maxDpth = 1 + max(maxDepth(root.left), maxDepth(root.right));
        return maxDpth;
    }
}
