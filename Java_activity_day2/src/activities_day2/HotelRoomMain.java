package activities_day2;

import java.util.*;

class HotelRoom{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	int calculateTariff() {
		int sqft=getNumberOfSqFeet();
		int rate=getRatePerSqFeet();
		return(sqft*rate);
		
	}
	int getRatePerSqFeet() {
		return 0;
	}
}

class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=10;
	}
	int getRatePerSqFeet() {
		if(hasWifi==true) {
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;	
	}
	
}

class DeluxeSeaViewRoom extends DeluxeRoom{

	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=12;
	}
}

class SuiteACRoom extends HotelRoom{
	protected int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=15;
	}
	int getRatePerSqFeet() {
		if(hasWifi==true) {
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;	
	}
}


public class HotelRoomMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator\n1.Deluxe Room\n2.Deluxe AC Room\n3.Suite AC Room\nSelect Room Type:");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Hotel Name:");
			String hname=sc.next();
			System.out.println("Room Square Feet Area:");
			int rsft=sc.nextInt();
			System.out.println("Room has TV(yes/no):");
			boolean tv=(sc.next().equals("yes"))? true:false;
			System.out.println("Room has Wifi(yes/no):");
			boolean wifi=(sc.next().equals("yes"))? true:false;
			DeluxeRoom dr=new DeluxeRoom(hname,rsft,tv,wifi);
			System.out.println("Room tariff per day is:"+dr.calculateTariff());
			
		}
		else if(choice==2) {
			System.out.println("Hotel Name:");
			String hname=sc.next();
			System.out.println("Room Square Feet Area:");
			int rsft=sc.nextInt();
			System.out.println("Room has TV(yes/no):");
			boolean tv=(sc.next().equals("yes"))? true:false;
			System.out.println("Room has Wifi(yes/no):");
			boolean wifi=(sc.next().equals("yes"))? true:false;
			DeluxeSeaViewRoom drac=new DeluxeSeaViewRoom(hname,rsft,tv,wifi);
			System.out.println("Room tariff per day is:"+drac.calculateTariff());
			
		}
		else if(choice==3) {
			System.out.println("Hotel Name:");
			String hname=sc.next();
			System.out.println("Room Square Feet Area:");
			int rsft=sc.nextInt();
			System.out.println("Room has TV(yes/no):");
			boolean tv=(sc.next().equals("yes"))? true:false;
			System.out.println("Room has Wifi(yes/no):");
			boolean wifi=(sc.next().equals("yes"))? true:false;
			SuiteACRoom sac=new SuiteACRoom(hname,rsft,tv,wifi);
			System.out.println("Room tariff per day is:"+sac.calculateTariff());
			
		}
		else {
			System.out.println("Wrong choice!");
		}
sc.close();
	}

}
