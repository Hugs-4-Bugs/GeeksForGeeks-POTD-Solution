class Solution {
    boolean kPangram(String str, int k) {
        int alphaCount = 0;
        int duplicatesCount = 0;
        HashSet<Character> alpha = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            if (alpha.contains(str.charAt(i))){
                duplicatesCount += 1;
            } else if (str.charAt(i) != ' '){
                alpha.add(str.charAt(i));
            }
        }
    
        
        if (alpha.size() == 26 || ((26 - alpha.size() <= duplicatesCount) && (26 - alpha.size()) <= k)){
            return true;
        } else {
            return false;
        }
        
    }
}
