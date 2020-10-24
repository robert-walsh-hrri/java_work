public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        String num1String = Integer.toString(num1);
        String num2String = Integer.toString(num2);

        if (num1String.charAt(0) == num2String.charAt(0) ||
                num1String.charAt(0) == num2String.charAt(1) ||
                num1String.charAt(1) == num2String.charAt(0) ||
                num1String.charAt(1) == num2String.charAt(1)) {
            return true;
        } else {
            return false;
        }
    }
}
