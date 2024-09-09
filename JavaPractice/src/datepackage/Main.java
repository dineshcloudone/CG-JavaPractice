package datepackage;

import java.util.Date;

import java.time.LocalDate;

/*
 * The java.time, java.util, java.sql and java.text packages contains classes for representing date and time. Following classes are important for dealing with date in Java.
 */

public class Main {
    public static void main(String[] args) {
        // Create a new Date object which represents the current date and time
        Date currentDate = new Date();
        
        // Print the current date
        System.out.println("Current Date: " + currentDate);
        
        LocalDate currentDate2 = LocalDate.now();
        
        // Print the current date
        System.out.println("Current Date: " + currentDate);
    }
}
