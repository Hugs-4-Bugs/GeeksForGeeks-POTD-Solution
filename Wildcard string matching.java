class Solution {
  
    
    static boolean check(int i, int j, String wild, String pattern) {
        // Base Cases
        if (i < 0 && j < 0) {
            return true;  // Both strings are exhausted, match found.
        }
        if (i < 0 && j >= 0) {
            return false;  // Wild string is exhausted, but pattern has remaining characters.
        }
        if (j < 0 && i >= 0) {
            // Pattern string is exhausted, but wild has remaining characters assumed to be '*'.
            for (int x = 0; x <= i; x++) {
                if (wild.charAt(x) != '*') {
                    return false;  // If there is a non-'*' character, return false.
                }
            }
            return true;  // All remaining characters in wild are assumed to be '*'.
        }

        // Matching characters or handling wildcards
        if (wild.charAt(i) == pattern.charAt(j) || wild.charAt(i) == '?') {
            return check(i - 1, j - 1, wild, pattern);  // Match or '?' character, move to the next characters.
        }
        if (wild.charAt(i) == '*') {
            // '*' character, try matching by moving one step back in either wild or pattern.
            return check(i - 1, j, wild, pattern) || check(i, j - 1, wild, pattern);
        }

        return false;
    }

    static boolean match(String wild, String pattern) {
        int n = wild.length();    // Size of the wild string.
        int m = pattern.length();  // Size of the pattern string.

        return check(n - 1, m - 1, wild, pattern);  // Start the recursive matching.
    }

  

}

