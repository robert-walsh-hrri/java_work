public class Main {

    public static void main(String[] args) {

        SpeedConverter.printConversion(78);
        long miles = SpeedConverter.toMilesPerHour(78);
        System.out.println("Miles = " + miles);
    }
}
