public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x<10) || (x>1000) || (y<10) || (y>1000) || (z<10) || (z>1000)) {
            return false;
        } else {
            int rightmostX = x % 10;
            int rightmostY = y % 10;
            int rightmostZ = z % 10;
            if ((rightmostX == rightmostY) || (rightmostY == rightmostZ) || (rightmostX == rightmostZ)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int p) {
        if ((p < 10) || (p > 1000)) {
            return false;
        }
        return  true;
    }
}
