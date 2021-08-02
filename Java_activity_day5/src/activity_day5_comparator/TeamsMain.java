package activity_day5_comparator;

import java.util.*;

class Team{
	String name;
	long numberofMatches;
	public Team(String name,long numberofMatches) {
		this.name=name;
		this.numberofMatches=numberofMatches;
	}
	public String toString()
    {
        return this.name +"-"+ this.numberofMatches;
    }
	
}

class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team t1, Team t2) {

		return (int)(t1.numberofMatches - t2.numberofMatches);
		
	}
	
}


public class TeamsMain {

	public static void main(String[] args) {
		
		ArrayList<Team> arr = new ArrayList<Team>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of teams");
		int numberofteams=sc.nextInt();
		for(int i=0;i<numberofteams;i++)
		{

			System.out.printf("Enter team %d detail\n",i+1);
			System.out.println("Enter Name:");
			String teamname=sc.next();
			System.out.println("Enter number of matches:");
			int numberofMatches=sc.nextInt();
	        arr.add(new Team(teamname, numberofMatches));
		}

		Collections.sort(arr, new TeamComparator());
		System.out.println("\nTeam list after sort by number of matches\n");
		for (int i = 0; i < arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
			
		sc.close();
		
	}

}