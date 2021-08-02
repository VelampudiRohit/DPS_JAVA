package activity_day5_HashMap;

import java.util.Scanner;

public class Wicket {
	private String playername;
	Bowler b=new Bowler();
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Bowler getB() {
		return b;
	}
	public void setB(Bowler b) {
		this.b = b;
	}
	
	public Wicket(String playername, Bowler b) {
		super();
		this.playername = playername;
		this.b = b;
	}
	

	

}
