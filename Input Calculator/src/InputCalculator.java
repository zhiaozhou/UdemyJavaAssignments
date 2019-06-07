import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0L;
        double counter = 0;
        while (true) {
            boolean ifValidInt = scanner.hasNextInt();
            if (ifValidInt) {
                int inputInt = scanner.nextInt();
                sum += inputInt;
                counter ++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        avg = Math.round(sum/counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
