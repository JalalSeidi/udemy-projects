
public class PracticingArraysAndLoops {

  public static void main(String[] args) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    for (String day : days) {
      String meal = switch (day) {
        case "Sunday" -> "pot roast";
        case "Monday" -> "spagheti";
        case "Tuesday" -> "tacos";
        case "Wednesday" -> "chicken";
        case "Thursday" -> "meatloaf";
        case "Friday" -> "hamburgers";
        default -> "pizza";
      };
      System.out.printf("We eat %s on %s%n", meal, day);
    }
  }
}
