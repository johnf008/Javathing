//programmerJohn
//practice utilizing the date and time classes
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.*;

public class java43DateAndTime {
    public static void main(String[] args){
        // assign a date as follows
        LocalDate lDate = LocalDate.parse("2023-08-27");
        System.out.println("The hard- coded date by programmerJohn is: " + lDate);

        //use the Date class to create an object referencing current date & time
        Date dateNow = new Date();
        System.out.println("ProgrammerJohn - the date time in default format is: " + dateNow);

        // you can obtain current date and time and then format it for the user
        LocalDateTime now = LocalDateTime.now();
        System.out.println("ProgrammerJohn's unformatted current date & time: " + now);

        //be mindful of the case in the format parameter value you provide
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");

        //use the dateTime object's format() method to assist with formatting
        System.out.println("The formatted dateTime for ProgrammerJohn: " + dateTime.format(now));
    }
}
