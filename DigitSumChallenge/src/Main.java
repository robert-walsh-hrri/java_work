public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-10));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number;
        }
        String numberString = Integer.toString(number);
        int count = 0;

//        for (int i = 0; i < numberString.length(); i++) {
//            count += Character.getNumericValue(numberString.charAt(i));
//        }
//        return count;

        count = 0;
        while (number > 0) {
            count += number % 10;
            number /= 10;
        }
        return count;
    }
}
