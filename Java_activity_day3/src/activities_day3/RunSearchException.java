package activities_day3;

import java.util.*;

public class RunSearchException {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the overs:");
			int overs=sc.nextInt();
			int runs[]=new int[overs];
			System.out.println("Enter the runs of every over:");
			for(int i=0;i<overs;i++)
			{
				runs[i]=sc.nextInt();
			}
			System.out.println("Enter the over:");
			int over=sc.nextInt();
			System.out.println("Runs scored in this over:"+runs[over-1]);
			sc.close();	
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub

	}

}
