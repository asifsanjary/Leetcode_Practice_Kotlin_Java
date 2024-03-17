// https://leetcode.com/problems/climbing-stairs/
// Time Complexity: O(n)
// Space Complexity: constant space
class Solution {
    fun climbStairs(n: Int): Int {
        if(n == 1) return 1;
        if(n == 2) return 2;
        var step1 = 1;
        var step2 = 2;
        var step3 = 0;
        for(i in 3 until n + 1) {
            step3 = step1 + step2;
            step1 = step2;
            step2 = step3;
        }
        return step3;
    }
}
