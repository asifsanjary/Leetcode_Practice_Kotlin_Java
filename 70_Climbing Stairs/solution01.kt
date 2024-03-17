// https://leetcode.com/problems/climbing-stairs/
// Time Complexity: O(n)
// Space Complexity: constant space
class Solution {
    fun climbStairs(n: Int): Int {
        if(n == 1) return 1;
        if(n == 2) return 2;
        var step1 = 1;
        var step2 = 2;
        for(i in 3..n) {
            val step3 = step1 + step2;
            step1 = step2;
            step2 = step3;
        }
        return step2;
    }
}
