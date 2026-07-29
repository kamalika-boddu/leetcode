import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Handle edge cases
        // Negative numbers are not palindromes.
        // Numbers ending in 0 (except 0 itself) are not palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int originalNum = x;
        int reversedNum = 0;

        // Step 2: Reverse the number mathematically
        while (x > 0) {
            int remainder = x % 10;                // Gets the last digit
            reversedNum = (reversedNum * 10) + remainder; // Appends it to the reversed number
            x = x / 10;                            // Removes the last digit from x
        }

        // Step 3: Compare the original number with the reversed number
        return originalNum == reversedNum;
    }
}