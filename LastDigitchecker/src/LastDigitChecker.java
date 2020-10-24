public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int num1End = num1 % 10;
        int num2End = num2 % 10;
        int num3End = num3 % 10;

        if (num1End == num2End ||
            num1End == num3End ||
            num2End == num3End ) {
            return true;
        }

        return false;
    }
    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}
