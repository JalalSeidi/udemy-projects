public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2313));
    }
    public static int sumFirstAndLastDigit(int number) {
        int firstdigit = 0;
        int lastdigit = 0;

        if(number >= 0 && number <= 9) {
            return number+number;
        } else if(number > 9) {
            lastdigit = number % 10;
            firstdigit = number;
            while (firstdigit >= 10) {
                firstdigit /= 10;
            }
            return firstdigit + lastdigit;
        } else {
            return -1;
        }
    }
}
