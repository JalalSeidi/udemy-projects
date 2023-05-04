public class PracticingArraysAndLoops {

  public static void main(String[] args) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    for (String day : days) {
      switch (day) {
        case "Sunday":
        System.out.println("We eat pot roast on Sunday");
        break;
        case "Monday":
        System.out.println("We eat spaghetti on Monday");
        break;
        case "Tuesday":
        System.out.println("We eat tacos on Tuesday");
        break;
        case "Wednesday":
        System.out.println("We eat chicken on Wednesday");
        break;
        case "Thursday":
        System.out.println("We eat meatloaf on Thursday");
        break;
        case "Friday":
        System.out.println("We eat hamburgers on Friday");
        break;
        default: // technically, no need for another "else if" since there's only one remaining option
        System.out.println("We eat pizza on Saturday");
        break;
      }
    }
  }
}
