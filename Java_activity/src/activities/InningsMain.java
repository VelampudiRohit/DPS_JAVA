package activities;

/**
 * @author Velampudi Rohit
 * @SFID 292119
 * @Question 2
 * @Activity 1
 */
import java.util.*;

class Innings{
	private String teamname; 
	private String inningsname;
	private String runs;
	
	
	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public String getRuns() {
		return runs;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	void DataInput() {
		Scanner sc=new Scanner(System.in); //scanner class created
		System.out.print("Enter the team name: ");  
		setTeamname(sc.nextLine());
		System.out.print("Enter session: ");  
		setInningsname(sc.nextLine());
		System.out.print("Enter runs: ");   
		setRuns(sc.nextLine());
		sc.close();
		
	}
	
	void DisplayInningsDetails()
	{
		int run=Integer.parseInt(runs); //converting runs from string into int
		if(inningsname.equals("first")) //comparing inningsname
		{
			run+=1;
			System.out.println("Need "+run + " to win");
		}
		else {
			System.out.println("Match ended");
		}
	}
	void DataOutput()
	{
		System.out.println("Name:"+getTeamname());
		System.out.println("Scored:"+getRuns());
		DisplayInningsDetails();
		
	}
}

public class InningsMain {

	public static void main(String[] args) {
		Innings i=new Innings();
		i.DataInput();
		i.DataOutput();

	}

}
