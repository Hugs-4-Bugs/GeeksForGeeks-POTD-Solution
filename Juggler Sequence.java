
class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        long res = Integer.MIN_VALUE;
        List<Long> list = new ArrayList<>();
        list.add(n);
        
        while(n!=1){
            if(n%2 == 0){
                res = (long)Math.pow(n, 0.5);
                list.add(res);
                n=res;
            } else {
                res = (long)Math.pow(n, 1.5);
                list.add(res);
                n=res;
            }
        }
        return list;
    }
}
