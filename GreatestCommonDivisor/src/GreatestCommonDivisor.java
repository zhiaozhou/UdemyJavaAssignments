public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return-1;
        } else {
            int commonDivisor = 0;
            for (int i1 = 1; i1 <= first; i1++) {
                int divisor1 = 1;
                if (first % i1 == 0) {
                    divisor1 = i1;
                }
                for (int i2=1; i2<=second; i2++) {
                    int divisor2 = 1;
                    if (second % i2 == 0) {
                        divisor2 = i2;
                    }
                    if (divisor1==divisor2) {
                        if (divisor1 > commonDivisor) {
                            commonDivisor = divisor1;
                        }
                    }
                }
            }
            return commonDivisor;
        }
    }
}
