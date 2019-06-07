public class TeenNumberChecker {
    public static boolean hasTeen(int p1, int p2, int p3) {
        if (((13 <= p1)&&(p1<=19))||((13 <= p2)&&(p2<=19))||((13 <= p3)&&(p3<=19))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int p) {
        if ((13 <= p)&&(p<=19)) {
            return true;
        } else {
            return false;
        }
    }
}
