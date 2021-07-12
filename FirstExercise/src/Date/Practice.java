package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Practice {
    public static void main(String[] args) {
//        LocalDate obj = LocalDate.now();
//        System.out.println(obj);
         LocalDateTime oldFormat = LocalDateTime.now();
        System.out.println("Before Formatting: "+oldFormat);
        DateTimeFormatter newFormat= DateTimeFormatter.ofPattern("dd-MM-yyyy H:mm:ss");
        String formattedDate = oldFormat.format(newFormat);
        System.out.println("After Formatting: "+formattedDate);
    }
}
