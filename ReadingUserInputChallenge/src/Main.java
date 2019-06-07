import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter number #" + counter);

            boolean ifEnterCorrectly = scanner.hasNextInt();
            if (ifEnterCorrectly) {
                int userInput = scanner.nextInt();
                sum += userInput;
            } else {
                System.out.println("Invalid input!");
                scanner.close();
                break;
            }
        }
        scanner.close();
        System.out.println("The sum of the numbers you entered is " + sum);
    }
}
