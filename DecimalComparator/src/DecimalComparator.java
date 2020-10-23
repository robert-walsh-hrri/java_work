public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        boolean naiveEquality = (int) firstNum == (int) secondNum;
        boolean threeDecimalEquality = (int) (firstNum * 1000) == (int) (secondNum * 1000);
        return naiveEquality && threeDecimalEquality;
    }
}
