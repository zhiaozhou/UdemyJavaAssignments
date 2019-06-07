public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int original_number = number;
        int reverse = 0;
        while (!(number == 0)) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (reverse == original_number) {
            return true;
        } else {
            return false;
        }
    }
}
