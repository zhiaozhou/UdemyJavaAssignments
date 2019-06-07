public class AreaCalculator {
    public static double area(double radius) {
        double area = -1.0;
        if (radius < 0) {
            return area;
        } else {
            area = radius * radius * Math.PI;
            return area;
        }
    }

    public static double area(double x, double y) {
        double area = -1.0;
        if ((x < 0) || (y < 0)) {
            return area;
        } else {
            return x * y;
        }
    }

}
