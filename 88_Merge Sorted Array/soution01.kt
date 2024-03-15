// Runtime O(m + n)
// Memory O(m + n)
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
         var i1: Int = 0 // for nums1
         var i2: Int = 0 // for nums2
         val nums3 = IntArray(m+n);
         var i3: Int = 0 // for nums3
         while(i1 < m && i2 < n) {
            if(nums1[i1] > nums2[i2]) {
                nums3[i3] = nums2[i2];
                i2++;
            }
            else{
                nums3[i3] = nums1[i1];
                i1++;
            }
            i3++;
         }

         while(i1 < m) {
            nums3[i3] = nums1[i1];
            i1++;
            i3++;
         }

         while(i2 < n) {
            nums3[i3] = nums2[i2];
            i2++;
            i3++;
         }

         i1 = 0;
         i3 = 0;
         while(i1 < m + n) {
            nums1[i1] = nums3[i3];
            i1++;
            i3++;
         }
    }
}
