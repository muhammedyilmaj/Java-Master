package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.swing.text.DateFormatter;


public class Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019,2,2);
        localDate=localDate.plusWeeks(2);
        LocalTime localTime=  LocalTime.now();
        System.out.println(localDate.toString());
        localDate.plusWeeks(2);
        System.out.println(localDate);
        LocalDateTime localDateTime= LocalDateTime.of(localDate,localTime).minusDays(1).minusHours(12).minusSeconds(12);
        System.out.println(localDateTime);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        DateTimeFormatter mediumdateTimeFormatter= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortdateformetter= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter largedate= DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        System.out.println("***"+ mediumdateTimeFormatter.format(localDateTime));
        System.out.println("***"+shortdateformetter.format(localDateTime));
        System.out.println(largedate.format(localDateTime));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("YYYY, MMMM dd,  HH:MM");
        System.out.println(localDateTime.format(dateFormatter));


    }
}
