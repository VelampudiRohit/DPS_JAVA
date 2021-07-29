package activities_day4;

import java.util.ArrayList;
import java.util.Scanner;

public class TopScorePlayers {

	public static void main(String[] args) {
		ArrayList<String> s13players=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the top 5 scorers of IPL Season 13:");
		for(int i=0;i<5;i++)
		{
			String player=sc.nextLine();
			s13players.add(player);
		}
		
		ArrayList<String> s12players=new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 12:");
		for(int i=0;i<5;i++)
		{
			String player=sc.nextLine();
			s12players.add(player);
		}
		
		s13players.retainAll(s12players);
		System.out.println("Consistent run scorers:");
		for(String name:s13players)
		{
			System.out.println(name);
		}
		
		sc.close();

	}

}
