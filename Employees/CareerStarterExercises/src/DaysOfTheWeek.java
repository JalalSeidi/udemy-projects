public class DaysOfTheWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "friday", "Saturday", "Sunday"};
        for (int day = 0; day < days.length; day++) {
            System.out.println(days[day]);
        }

        for (String day : days) {
            System.out.println(day);
        }
        for (int day = 0; day < days.length; day++) {
            if (day % 2 == 0) {
                System.out.println(days[day]);
            } else {
                System.out.println(days[day].toUpperCase());
            }
        }

        for (int day = 0; day < days.length; day++) {
            String output = day % 2 == 0 ? days[day] : days[day].toUpperCase();
            System.out.println(output);
        }
    }
}
