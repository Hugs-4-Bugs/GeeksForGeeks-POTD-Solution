class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
         int count = 0;
        HashSet<Integer> set = new HashSet<>(head2);
        
        for (int num : head1) {
            int complement = x - num;
            if (set.contains(complement)) {
                count++;
            }
        }
        
        return count;
    }
}
