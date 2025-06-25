// Find the index of the first occurance in a string 

// link -> https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

Solution 1 
class Solution {
    public int strStr(String haystack, String needle) {
       for(int i=0;i<haystack.length();i++){
        for(int j=i+1;j<=haystack.length();j++){
         String ans = haystack.substring(i,j);
         if (ans.equals(needle)) return i;
       }
       }

       return -1;
    }
}
