public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x<10)||(x>99)||(y<10)||(y>99)) {
            return false;
        } else {
            while (!(x == 0)) {
                int digitX = x % 10;
                int divisionY = y;
                while (!(divisionY==0)) {
                    int digitY = divisionY % 10;
                    if (digitX == digitY) {
                        return true;
                    }
                    divisionY /= 10;
                }
                x /= 10;
            }
        }
        return false;
    }
}
