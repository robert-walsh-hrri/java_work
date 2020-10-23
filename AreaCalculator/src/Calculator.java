public class Calculator {

    public static double areaCalculator(double radius) {
        if (radius < 0) return -1;
        return Math.PI * Math.pow(radius, 2);
    }

    public static double areaCalculator(double height, double width) {
        if (height < 0 || width < 0) return -1;
        return height * width;
    }
}
