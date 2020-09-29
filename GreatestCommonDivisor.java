public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 35));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestdevisor = 0;
        if (first >= 10 && second >= 10) {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0)
                    greatestdevisor = i;
            }
            return greatestdevisor;

        } else {
            return -1;
        }
    }
}
