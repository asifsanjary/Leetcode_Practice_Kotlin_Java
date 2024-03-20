class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0;
        var end = s.length - 1;
        while(start <= end) {
            if(!isAlphaN(s[start])) {
                start++;
            }
            else if(!isAlphaN(s[end])) {
                end--;
            }
            else {
                val startLetter = if(isCapitalLetter(s[start])) ('a' + (s[start] - 'A')) else s[start];
                val endLetter = if(isCapitalLetter(s[end])) ('a' + (s[end] - 'A')) else s[end];
                if(startLetter == endLetter) {
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    fun isAlphaN(c: Char): Boolean {
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) return true;
        return false;
    }

    fun isCapitalLetter(c: Char): Boolean {
        if(c >= 'A' && c <= 'Z') return true;
        return false;
    }
}
