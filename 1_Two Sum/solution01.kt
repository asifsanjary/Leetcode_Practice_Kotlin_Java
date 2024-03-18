// https://leetcode.com/problems/two-sum/
// TC: O(n)
// SC: O(n)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberContainer = mutableMapOf<Int, Int>();

        for(i in 0..(nums.size -1)) {
            val rest = target - nums[i];
            if(numberContainer.contains(rest)) {
                val restIndex = numberContainer.getValue(rest);
                return intArrayOf(restIndex, i);
            }
            else{
                numberContainer.put(nums[i],i);
            }
        }
        return intArrayOf(-1, -1);
    }
}
