package activities_day3;

import java.util.*;

class TeamNameNotFound extends Exception{
	String message;
	TeamNameNotFound(String str) {
	      message = str;
	   }
	public String toString() {
	      return ("TeamNameNotFoundException: " + message);
	   }
}

public class TeamName {

	public static void main(String[] args) {
		
		
		String teams[]= {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders",
				"Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the expected winner team of IPL Season 13");
			String winner=sc.nextLine();
			for(String i:teams)
			{
				if(i.equals(winner)) {
					System.out.println("Expected runner team of IPL Season 13:"+winner);
				}
				else {
					throw new TeamNameNotFound("Entered team is not a part of IPL Season 13");
				}
			}
			System.out.println("Enter the expected runner team of IPL Season 13");
			String runner=sc.nextLine();
			for(String i:teams) {
				
				if(i.equals(runner)) {
					System.out.println("Expected runner team of IPL Season 13"+runner);
				}
				else {
					throw new TeamNameNotFound("Entered team is not a part of IPL Season 13");
				}
				
			}
			sc.close();

		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
