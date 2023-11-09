class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n = S.length();
        
        if(n > 8 || n == 0) return "-1";
        
        Stack<Integer> stack = new Stack<>();
        int current = 1;
        
        String number = "";
        for(char ch : S.toCharArray()) {
            stack.push(current++);
            if(ch == 'I') {
                while(!stack.isEmpty()) {
                    number += stack.pop();
                }
            }
        }
        stack.push(current);
        while(!stack.isEmpty()) {
            number += stack.pop();
        }
        return number;
    }
    
}
