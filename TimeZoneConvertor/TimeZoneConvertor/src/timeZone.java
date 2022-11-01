import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class timeZone {

    public static void main(String[] args) {
      String dateTimeText = "July 12, 1984 13:47:00";

      DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd, yyyy kk:mm:ss");
      TemporalAccessor dateTime = df.parse(dateTimeText);
      LocalDateTime localDateTime = LocalDateTime.from(dateTime);
      ZonedDateTime startZDT = ZonedDateTime.of(localDateTime, ZoneId.of("-8"));
      ZonedDateTime endZDT = startZDT.withZoneSameInstant(ZoneId.of("+0"));
      System.out.println(startZDT);
      System.out.println(endZDT);

      ZonedDateTime japan = startZDT.plusDays(179).plusHours(7).plusMinutes(27).withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
      System.out.println(japan);
    }
  }
