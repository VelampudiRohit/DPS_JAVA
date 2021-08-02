package activities_day6;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
 
public class CalculateAge {
 
	public static void main(String[] args) throws ParseException {
        System.out.print("Please enter date of birth in dd-mm-yyyy: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        Date date1=new SimpleDateFormat("dd-mm-yyyy").parse(input); 
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(date1);
 
        LocalDate dob = LocalDate.parse(strDate);
        System.out.println("Age is:" + getAge(dob));
        

    }
 

    public static int getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }
 
}
