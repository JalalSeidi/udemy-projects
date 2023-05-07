public class Testing {

  public static void main(String[] args) {
    System.out.println(alternateCaps("roses"));
  }

  public static String alternateCaps(String word) {
    StringBuilder sb = new StringBuilder(word.length());
    for (int index=0; index<word.length(); index++) {
      String curLetter = word.substring(index, index+1);
      if (index % 2 == 0) {
        sb.append(curLetter);
      } else {
        sb.append(curLetter.toUpperCase());
      }
    }
    return sb.toString();
  }
}
