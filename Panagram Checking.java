class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
           s = s.toLowerCase();
        
        // Create a set to store unique characters.
        HashSet<Character> set = new HashSet<>();
        
        // Iterate through each character in the string.
        for (char ch : s.toCharArray()) {
            // Add alphabetic characters to the set.
            if (Character.isAlphabetic(ch)) {
                set.add(ch);
            }
        }
        
        // If the set size is 26, it contains all letters of the alphabet.
        return set.size() == 26;
    }
}

