public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int countdown = first;

        while (countdown > 0) {
            countdown--;
            if (first % countdown == 0 && second % countdown == 0) {
                break;
            }
        }

        return countdown;
    }
}
