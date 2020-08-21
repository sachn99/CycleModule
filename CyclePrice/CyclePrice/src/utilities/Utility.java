package utilities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utility {

	
public	ArrayList<Long> getDateDiff(String StartDate, String EndDate){

	ArrayList<Long> dateDiff = new ArrayList<>();
	 final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
     
     final LocalDate firstDate = LocalDate.parse(StartDate, formatter);
     final LocalDate secondDate = LocalDate.parse(EndDate, formatter);
     final long year = ChronoUnit.YEARS.between(firstDate, secondDate);

     final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
     
     dateDiff.add(year);
     dateDiff.add(days);
     
	return dateDiff;



}

}