package SharmileesTasks;



import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class MyClass {
    public static void main(String[] args) {

        LocalDateTime myDate= LocalDateTime.now();
        System.out.println("Non formated Date: "+myDate);
        DateTimeFormatter myFormatedDate= DateTimeFormatter.ofPattern("dd MM YY HH MM SS");
        String formatedDate= myDate.format(myFormatedDate);
        System.out.println("After Formatting: "+formatedDate);

    }
}