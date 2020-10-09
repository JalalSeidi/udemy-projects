public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 35));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestdivisor = 0;
        int min = Math.min(first, second);
        if (first >= 10 && second >= 10) {
            for (int i = 1; i <= min ; i++) {
                if (first % i == 0 && second % i == 0)
                    greatestdivisor = i;
            }
        } else {
            return -1;
        }
        return greatestdivisor;
    }
}
