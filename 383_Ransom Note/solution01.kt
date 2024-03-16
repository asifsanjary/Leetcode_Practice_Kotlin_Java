// https://leetcode.com/problems/ransom-note/
// Run Complexity: O(n + m)
// Memoery Complexity: constant memory
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val charContainer = IntArray(26);
        for(i in magazine) {
            charContainer[i - 'a']++;
        }
        for(i in ransomNote) {
            val index = i - 'a';
            if(charContainer[index] > 0) charContainer[index]--;
            else return false;
        }
        return true;
    }
}
