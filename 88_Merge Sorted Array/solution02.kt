// Problem Link: https://leetcode.com/problems/merge-sorted-array/
// Runtime O(m + n)
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
         var i1: Int = m - 1 // for nums1
         var i2: Int = n - 1 // for nums2
         var i3: Int = m + n -1 // for n + m

         while(i2 > -1) {
            if(i1 > -1 && nums1[i1] > nums2[i2]) {
                nums1[i3--] = nums1[i1--];
            }
            else {
                nums1[i3--] = nums2[i2--];
            }
         }
    }
}
