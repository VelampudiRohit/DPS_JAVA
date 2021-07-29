package activities_day4;

import java.util.ArrayList;
import java.util.Scanner;

public class FiftysAndHundreds {

	public static void main(String[] args) {
		ArrayList<Integer> Twenty20=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int score=sc.nextInt();
			Twenty20.add(score);
		}
		
		int fifty=0,hundred=0;

		for(int i:Twenty20)
		{
			if(i>49 && i<100)
				fifty+=1;
			else if(i>100)
				hundred+=1;
			else
				continue;
				
		}
		System.out.println("-----------------------------------------");
		System.out.println(fifty);
		System.out.println(hundred);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
