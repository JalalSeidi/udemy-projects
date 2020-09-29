public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(90, 59));
    }
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if ((numberOne >= 10 && numberOne <= 99) && (numberTwo >= 10 && numberTwo <= 99)) {
            int numberOneLastDigit = numberOne % 10;
            int numberTwoLastDigit = numberTwo % 10;
            numberOne /= 10;
            numberTwo /= 10;
            int numberOneFirstDigit = numberOne;
            int numberTwoFirstDigit = numberTwo;
            return ((numberOneFirstDigit == numberTwoLastDigit) || (numberOneFirstDigit == numberTwoFirstDigit) || (numberOneLastDigit == numberTwoLastDigit) || (numberOneLastDigit == numberTwoFirstDigit));
        } else {
        return false;
        }
    }
}
