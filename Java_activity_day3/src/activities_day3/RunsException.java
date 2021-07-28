package activities_day3;

import java.io.*;

public class RunsException {

	public static void main(String[] args) {
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter your runs: ");
			int runs=Integer.parseInt(reader.readLine());
			System.out.println("Enter your overs: ");
			int overs=Integer.parseInt(reader.readLine());
			float runrate=runs/overs;
			System.out.println("Run rate is:"+runrate);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
