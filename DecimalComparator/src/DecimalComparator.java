public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2) {
        int newP1 = (int) (p1 * 1000);
        int newP2 = (int) (p2 * 1000);
        if (newP1 == newP2) {
            return true;
        } else {
            return false;
        }
    }
}
