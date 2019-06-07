public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = -1L;
        if (kilometersPerHour < 0) {
            return milesPerHour;
        } else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
    }
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}