public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 35));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestdivisor = 0;
        if (first >= 10 && second >= 10) {
            if (first < second) {
                for (int i = 1; i <= first; i++) {
                    if (first % i == 0 && second % i == 0)
                        greatestdivisor = i;
                }
            }
            if (second < first) {
                for (int i = 1; i <= second; i++) {
                    if (second % i == 0 && first % i == 0)
                        greatestdivisor = i;
                }
            }
            if (first == second) {
                for (int i = 1; i <= second; i++) {
                    if (second % i == 0)
                        greatestdivisor = i;
                }
            }
        } else {
            return -1;
        }
        return greatestdivisor;
    }
}
