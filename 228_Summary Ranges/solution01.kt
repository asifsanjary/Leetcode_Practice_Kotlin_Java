// https://leetcode.com/problems/summary-ranges/
// Time Complexity: O(n)
// Space Complexity: O(n) worst case
class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        var i = 0;
        val result = mutableListOf<String>();
        while(i < nums.size) {
            var j = i;
            while(j + 1 < nums.size && nums[j + 1] == nums [j] + 1) {
                j++;
            }
            if(j != i) { 
                result.add(nums[i].toString() + "->" + nums[j].toString());
                i = j + 1;
            }
            else{
                result.add(nums[i].toString());
                i++;
            }
        }
        return result.toList();
    }
}
