class Solution {
    public String removeKdigits(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int digitsToRemove = K;

        for (char c : S.toCharArray()) {
            while (sb.length() != 0 && digitsToRemove > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                digitsToRemove--;
            }
            sb.append(c);
        }

        // Remove any remaining trailing digits if necessary
        while (digitsToRemove > 0) {
            sb.deleteCharAt(sb.length() - 1);
            digitsToRemove--;
        }

        // Remove leading zeros
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        return sb.length() == i ? "0" : sb.substring(i);
    }
}
