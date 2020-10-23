public class TeenNumberChecker {

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
        return isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum);
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
