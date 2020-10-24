import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;
        long average = 0;

        while (true) {
            System.out.println("Please enter a number:");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {

                int validInput = scanner.nextInt();
                total += validInput;
                count++;
                average = Math.round((double)(total / count));

            } else {

                System.out.println("SUM = " + total + " AVG = " + average);
                break;

            }
        }

        scanner.close();
    }
}
