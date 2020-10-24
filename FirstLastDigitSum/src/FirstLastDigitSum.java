public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        String numberString = Integer.toString(number);

        return Character.getNumericValue(numberString.charAt(0)) +
                Character.getNumericValue(numberString.charAt(numberString.length() - 1));
    }
}
