package activities_day4;

import java.util.*;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			h.add(sc.next());
		}
        
        System.out.println(h.size());
        sc.close();

	}

}
