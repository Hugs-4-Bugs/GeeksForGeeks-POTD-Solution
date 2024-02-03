class Solution {
    long DecimalValue(Node head) {
        long mod = (long) 1e9 + 7;
        if (head == null)
            return 0;

        long num = 0;
        int count = 0;

        while (head != null) {
            num = (num * 2 + head.data) % mod;
            head = head.next;
        }

        return num;
    }
}
