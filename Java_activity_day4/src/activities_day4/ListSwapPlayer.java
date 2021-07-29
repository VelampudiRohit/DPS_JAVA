package activities_day4;

import java.util.*;
public class ListSwapPlayer {

	public static void main(String[] args) {
		ArrayList<String> myteamlist=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 teams:");
		for(int i=0;i<5;i++)
		{
			String team=sc.nextLine();
			myteamlist.add(team);
		}
		System.out.println("Enter swap positons:");
		int fswap=sc.nextInt();
		int sswap=sc.nextInt();
		Collections.swap(myteamlist, fswap-1, sswap-1);
		System.out.println(myteamlist);
		sc.close();
		// TODO Auto-generated method stub

	}

}
