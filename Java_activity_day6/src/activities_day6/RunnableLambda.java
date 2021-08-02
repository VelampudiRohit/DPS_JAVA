package activities_day6;

import java.lang.Runnable;

public class RunnableLambda{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	      Runnable r1 = () -> {   
	         System.out.println("Runnable with Lambda Expression");
	      };

	      new Thread(r1).start();
	      
	      

}
}