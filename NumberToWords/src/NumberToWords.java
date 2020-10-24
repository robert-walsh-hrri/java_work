public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digits = getDigitCount(number);
        number = reverse(number);
        int afterDigits = getDigitCount(number);

        if (digits != afterDigits) {
            
        }

    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return 1;
        }
        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
