public class FirstLastDigitSum {
    public static int sumFisrtAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int numLoop = 0;
            int sum = 0;
            while (!(number == 0)) {
                int digit = number % 10;
                if (numLoop == 0) {
                    sum += digit;
                }
                number /= 10;
                if (number == 0) {
                    sum += digit;
                }
                numLoop++;
            }
            return sum;
        }
    }
}
