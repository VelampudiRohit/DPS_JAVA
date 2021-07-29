package activities_day3;
import java.util.Scanner;


abstract class Match{
	private int currentscore;
	private float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate, int balls);
}

class ODIMatch extends Match{
	float maxover=50;
	@Override
	float calculateRunRate() {
		float oversleft=maxover-getCurrentover();
		int runsleft=getTarget()-getCurrentscore();
		float runrate= runsleft/oversleft;
		
		return runrate;
	}

	@Override
	int calculateBalls() {
		float oversleft=maxover-getCurrentover();
		int balls= (int) (oversleft*6);
		return balls;
	}

	@Override
	void display(double reqRunrate, int balls) {
		int runsleft=getTarget()-getCurrentscore();
		System.out.println("Need "+runsleft+" runs in "+balls+" balls");
		System.out.println("Required Run rate:"+String.format("%.2f", reqRunrate));
		
		// TODO Auto-generated method stub
		
	}
	
}

class T20Match extends Match{
	float maxover=20;
	@Override
	float calculateRunRate() {
		float oversleft=maxover-getCurrentover();
		int runsleft=getTarget()-getCurrentscore();
		float runrate= runsleft/oversleft;
		
		return runrate;
	}

	@Override
	int calculateBalls() {
		float oversleft=maxover-getCurrentover();
		int balls= (int) (oversleft*6);
		return balls;
	}

	@Override
	void display(double reqRunrate, int balls) {
		int runsleft=getTarget()-getCurrentscore();
		System.out.println("Need "+runsleft+" runs in "+balls+" balls");
		System.out.println("Required Run rate:"+String.format("%.2f", reqRunrate));
		
		// TODO Auto-generated method stub
		
	}
	
}

class TestMatch extends Match{
	float maxover=90;
	@Override
	float calculateRunRate() {
		float oversleft=maxover-getCurrentover();
		int runsleft=getTarget()-getCurrentscore();
		float runrate= runsleft/oversleft;
		
		return runrate;
	}

	@Override
	int calculateBalls() {
		float oversleft=maxover-getCurrentover();
		int balls= (int) (oversleft*6);
		return balls;
	}

	@Override
	void display(double reqRunrate, int balls) {
		int runsleft=getTarget()-getCurrentscore();
		System.out.println("Need "+runsleft+" runs in "+balls+" balls");
		System.out.println("Required Run rate:"+String.format("%.2f", reqRunrate));
		
		// TODO Auto-generated method stub
		
	}
	
}

public class MatchMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the match format\n1.ODI\n2.T20\n3.Test");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			ODIMatch odi=new ODIMatch();
			System.out.println("Enter Current score:");
			odi.setCurrentscore(sc.nextInt());
			System.out.println("Enter Current over:");
			odi.setCurrentover(sc.nextFloat());
			System.out.println("Enter target score:");
			odi.setTarget(sc.nextInt());
			odi.display(odi.calculateRunRate(), odi.calculateBalls());
			break;
		case 2:
			T20Match t20=new T20Match();
			System.out.println("Enter Current score:");
			t20.setCurrentscore(sc.nextInt());
			System.out.println("Enter Current over:");
			t20.setCurrentover(sc.nextFloat());
			System.out.println("Enter target score:");
			t20.setTarget(sc.nextInt());
			t20.display(t20.calculateRunRate(), t20.calculateBalls());
			break;
		case 3:
			TestMatch test=new TestMatch();
			System.out.println("Enter Current score:");
			test.setCurrentscore(sc.nextInt());
			System.out.println("Enter Current over:");
			test.setCurrentover(sc.nextFloat());
			System.out.println("Enter target score:");
			test.setTarget(sc.nextInt());
			test.display(test.calculateRunRate(), test.calculateBalls());
			break;
		default:
			System.out.println("Invalid Option...please enter again.");
			break;

	}
		sc.close();

}
}