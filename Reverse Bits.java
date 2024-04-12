class Solution {
    static Long reversedBits(Long x) {
        long result = 0;
        
       // Since i'm considering 32-bit representation, so will iterate till 31.

          for (int i = 0; i < 32; i++) {       
              
            // after iterating i'll extract the rightmost bit of x
            long rightmostBit = (x >> i) & 1;

            // And after that i'll shift the rightmost bit to its reversed position 
             result |= rightmostBit << (31 - i);
          }

            // Then after we'll return the result 
            return result;
    }

    public static void main(String[] args) {
        long x = 1;
        System.out.println(reversedBits(x)); 
    }
}





