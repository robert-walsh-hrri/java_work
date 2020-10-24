public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int absNumber = Math.abs(number);

        String numberString = Integer.toString(absNumber);

        int midpoint = numberString.length() / 2;

        for (int i = 0; i < numberString.length() - 1; i++) {
            if (i == midpoint && numberString.length() % 2 == 1) {
                break;
            }
            if (numberString.charAt(i) != numberString.charAt(numberString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
