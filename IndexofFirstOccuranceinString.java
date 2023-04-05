//two strings are given see if the second string (needle) occurs in the first string(haystack) if not return -1
public class IndexofFirstOccuranceinString {
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.contains(needle)) {
                return haystack.indexOf(needle);
            }
            return -1;
        }
    }
}
