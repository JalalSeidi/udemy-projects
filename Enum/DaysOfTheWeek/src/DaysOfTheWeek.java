import java.util.Random;

public class DaysOfTheWeek {
  enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
  }
  public static void main(String[] args) {
    for (DayOfWeek day : DayOfWeek.values()) {
      System.out.println(day);
    }

    for (DayOfWeek day : DayOfWeek.values()) {
      String dayText = day.toString().toLowerCase();
      System.out.println(dayText.substring(0,1).toUpperCase() + dayText.substring(1));
    }

    int index = 0;
    for (DayOfWeek day : DayOfWeek.values()) {
      String dayText = day.toString().toLowerCase();
      if (index % 2 == 0) {
        System.out.println(dayText.substring(0, 1).toUpperCase() + dayText.substring(1));
      } else {
        int middleIndex = dayText.length() / 2;
        StringBuilder sb = new StringBuilder();
        sb.append(dayText.substring(0,middleIndex));
        sb.append(dayText.substring(middleIndex, middleIndex+1).toUpperCase());
        sb.append(dayText.substring(middleIndex + 1));
        System.out.println(sb.toString());
      }
      index++;
    }

    Random random = new Random();
    for (int counter = 0; counter < 10; counter++) {
      int dayIndex = random.nextInt(7);
      System.out.println(DayOfWeek.values()[dayIndex]);
    }
  }

}
