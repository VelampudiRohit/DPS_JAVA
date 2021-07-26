package activities;

import java.util.*;

class Player{
	private String stringF,stringS;

	public void setStringF(String stringF) {
		this.stringF = stringF;
	}

	public void setStringS(String stringS) {
		this.stringS = stringS;
	}
	
	public void NameInput()
	{
		Scanner sc=new Scanner(System.in);
		setStringF(sc.nextLine());
		setStringS(sc.nextLine());
		sc.close();
	}
	public void NameOutput()
	{
		stringF = stringF.substring(0,1).toUpperCase() + stringF.substring(1).toLowerCase();
		stringS = stringS.toUpperCase();
		System.out.println(stringF+" "+stringS);
	}
}
public class PlayerMain {

	public static void main(String[] args) {
		Player p=new Player();
		p.NameInput();
		p.NameOutput();

	}

}
