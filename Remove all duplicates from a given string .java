class Solution {
    String removeDuplicates(String str) {
         // Using LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Add characters to set, which automatically removes duplicates
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        // Reconstruct the string from the set
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "geEksforGEeks";
        String str2 = "HaPpyNewYear";
        System.out.println(solution.removeDuplicates(str1)); // Output: geEksforG
        System.out.println(solution.removeDuplicates(str2)); // Output: HaPpyNewYr

    }
}

