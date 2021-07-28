package activities_day3;

import java.util.*;

class CustomException extends Exception{
	String message;
	   CustomException(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : " + message);
	   }
}
public class AgeRange {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the player name:");
			String name=sc.nextLine();
			System.out.println("Enter the age:");
			int age=sc.nextInt();
			if(age>=19)
			{
				System.out.println("player name:"+name);
				System.out.println("player age:"+age);
			}
			else {
				throw new CustomException("InvalidAgeRangeException");
			}
			
			sc.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		// TODO Auto-generated method stub

	}

}
