public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        } else {
            int biggestPrimeFactor = -1;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    int countDivisor = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            countDivisor++;
                        }
                    }
                    if (countDivisor == 2 && i > biggestPrimeFactor) {
                        biggestPrimeFactor = i;
                    }
                }
            }
            return biggestPrimeFactor;
        }
    }
}
