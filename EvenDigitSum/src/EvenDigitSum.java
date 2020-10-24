public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        String numberString = Integer.toString(number);

        int count = 0;

        for (int i = 0; i < numberString.length(); i++) {
            if (Character.getNumericValue(numberString.charAt(i)) % 2 == 0) {
                count += Character.getNumericValue(numberString.charAt(i));
            }
        }

        return count;
    }
}
