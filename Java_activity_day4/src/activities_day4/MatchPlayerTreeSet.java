package activities_day4;

import java.util.*;

public class MatchPlayerTreeSet {

	public static void main(String[] args) {
		TreeSet<String> Players=new TreeSet<String>();  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Players.add(sc.next());
		}

		Iterator<String> itr=Players.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		sc.close();

	}

}
