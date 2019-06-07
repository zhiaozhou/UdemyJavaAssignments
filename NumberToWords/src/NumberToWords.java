public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int countOriginalNumber = getDigitCount(number);
            number = reverse(number);
            int countNumber = getDigitCount(number);
            int countDifference = countOriginalNumber - countNumber;
            String words = "";
            if (number == 0) {
                System.out.println("Zero ");
            } else {
                while (!(number == 0)) {
                    int digit = number % 10;
                    switch (digit) {
                        case 0:
                            words += "Zero ";
                            break;
                        case 1:
                            words += "One ";
                            break;
                        case 2:
                            words += "Two ";
                            break;
                        case 3:
                            words += "Three ";
                            break;
                        case 4:
                            words += "Four ";
                            break;
                        case 5:
                            words += "Five ";
                            break;
                        case 6:
                            words += "Six ";
                            break;
                        case 7:
                            words += "Seven ";
                            break;
                        case 8:
                            words += "Eight ";
                            break;
                        case 9:
                            words += "Nine ";
                            break;
                    }
                    number /= 10;
                }
                for (int i = 1; i <= countDifference; i++) {
                    words += "Zero ";
                }
                System.out.println(words);
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (!(number == 0)) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int count = 1;
            while (!(number == 0)) {
                number /= 10;
                if (number > 0) {
                 count++;
                }
            }
            return count;
        }
    }
}
