package Learning.company;

public class ReverseArray {

  /**
   * Reverses the elements in the array
   *
   * @param array array of int
   */
  public static void reverse(int[] array) {
    int maxIndex = array.length - 1;
    int halfLength = array.length / 2;
    for (int i = 0; i < halfLength; i++) {
      int temporarily = array[i];
      array[i] = array[maxIndex - i];
      array[maxIndex - i] = temporarily;
    }
  }
}

