class Solution {
    String binaryNextNumber(String s) {
        String ans = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                ans = "0" + ans;;
                if(i == 0) {
                    return "1" + ans;
                }
            } else {
                ans = s.substring(0, i) + "1" + ans;
                break;
            }
        }
        ans = ans.replaceAll("^[0]*", "");
        return ans;
    }
}
