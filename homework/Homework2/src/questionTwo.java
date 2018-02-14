
import java.time.*;
import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        // Ask for year
        System.out.println("Enter the year");
        int year = imput.nextInt();
        // Ask for what day the first of January fell on
        System.out.println("Enter the specific day that first of January fell on");
        int startDay = imput.nextInt();
        int month, monthDays;

        // stores the months
        String[] months = {
                "January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        // Display month calendars
        for (int i = 0; i < months.length; i++) {

            month = Month.valueOf(months[i].toUpperCase()).getValue();

            monthDays = YearMonth.of(year, month).lengthOfMonth();

            // prints the month and year
            System.out.printf("%20s\n", months[i] + " " + year);

            // prints the header
            System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa");

            // Print spaces
            for (int d = 0; d < startDay; d++) {
                if (startDay == 7) {
                    break;
                } else if (startDay > 7) {
                    System.out.printf("%3s ", " ");
                    break;
                } else {
                    System.out.printf("%3s ", " ");
                }
            }
            // Print calendar
            for (int j = 1; j <= monthDays; j++) {
                System.out.printf("%3d ", j);
                // Indent new line
                if (((j + startDay) % 7 == 0) || (i == monthDays)) {
                    System.out.println();
                }
            }
            // Set new line for new month
            System.out.println();
            // Reset start date
            LocalDate localDate = LocalDate.of(year, month, monthDays);
            startDay = localDate.getDayOfWeek().getValue() + 1;
        }
    }
}
//https://stackoverflow.com/questions/35679827/how-to-display-calendar-in-java
//http://www.dreamincode.net/forums/topic/86793-displaying-calendar-for-each-month-of-given-yearday/
//https://introcs.cs.princeton.edu/java/21function/Calendar.java.html
//http://www.javaproblems.com/2012/12/displaying-calendars-with-java-solution.html
//https://stackoverflow.com/questions/25070823/printing-a-calendar-from-given-month-year
//http://www.baeldung.com/java-8-date-time-intro