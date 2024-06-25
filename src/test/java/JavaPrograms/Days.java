package JavaPrograms;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Days {

	public static void main(String[] args) {
		
		 Month month = Month.JUNE;
	        int year = 2024; // You can change the year as needed

	        // Start with the first day of the month
	        LocalDate date = LocalDate.of(year, month, 1);

	        // Loop through the days in June
	        int workingDaysCount = 0;
	        while (date.getMonth() == month) {
	            // Check if it's a working day (Monday to Friday)
	            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
	                // Print the date if it's a working day
	                System.out.println(date);
	                workingDaysCount++;
	            }
	            // Move to the next day
	            date = date.plusDays(1);
	            
	            // Stop after printing 5 working days
	            if (workingDaysCount == 5) {
	                break;
	            }
	        }

	}

}
