public class toCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) {
            return -1;
        }
        if (inches > 12 || inches < 0) {
            return -1;
        }

        return (feet * 30.48) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return calcFeetAndInchesToCentimeters((int)(inches / 12), (int) (inches % 12));
    }
}
