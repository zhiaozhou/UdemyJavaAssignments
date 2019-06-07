import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter < 10) {
            int digit = counter + 1;
            System.out.println("Enter number #" + digit + " :");
            boolean isInputValid = scanner.hasNextInt();
            if (isInputValid) {
                int inputNumber = scanner.nextInt();
                if (inputNumber < min) {
                    min = inputNumber;
                }
                if (inputNumber > max) {
                    max = inputNumber;
                }
            } else {
                System.out.println("You entered an invalid number!");
                break;
            }
            counter ++;
            scanner.nextLine();
        }
        System.out.println("The min value is " + min);
        System.out.println("The max value is " + max);
        scanner.close();
    }
}
