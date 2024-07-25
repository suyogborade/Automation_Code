package JavaPrograms;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Days {

	public static void main(String[] args) {
		
		int year = 2024;
        int month = 7; // June
        
        // Create a LocalDate for the first day of the specified month
        LocalDate startDate = LocalDate.of(year, month, 1);
        
        // Find the last day of the month
        LocalDate endDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        
        // Initialize DateTimeFormatter for the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Iterate through each day of the month
        LocalDate currentDate = startDate;
        while (currentDate.isBefore(endDate.plusDays(1))) {
            // Check if the current day is a working day (Monday to Friday)
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                // Print date in the required format
                System.out.println(currentDate.format(formatter));
            }
            
            // Move to the next day
            currentDate = currentDate.plusDays(1);
        }
	}

}
