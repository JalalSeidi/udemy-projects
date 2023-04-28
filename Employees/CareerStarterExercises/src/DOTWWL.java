public class DOTWWL {
  public static void main(String[] args) {

    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int day = 0;
    while (day < days.length) {
      if (day % 2 == 0) {
        System.out.println(days[day++]);
      } else {
        System.out.println(days[day++].toUpperCase());
      }
    }
  }
}
