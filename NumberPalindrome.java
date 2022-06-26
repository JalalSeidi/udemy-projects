public class NumberPalindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome(0));
  }

  public static boolean isPalindrome(int number) {
    int a = number;
    int lastDigit = 0;
    int reverse = 0;
    while (number != 0) {
      lastDigit = number % 10;
      reverse = (reverse * 10) + lastDigit;
      number /= 10;
    }
    if (reverse == a) {
      return true;
    } else {
      return false;
    }
  }
}
