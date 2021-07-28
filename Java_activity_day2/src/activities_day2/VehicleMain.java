package activities_day2;

import java.util.*;
class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getFuelCapacity() {
		return fuelCapacity;
	}


	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}


	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}


	void displayMake()
	{
		System.out.println("\n****"+getMake()+"****");
	}
	
	void displayBasicInfo()
	{
		System.out.println("----Basic Information----");
		System.out.println("Vehicle Number:"+getVehicleNumber());
		System.out.println("Fuel Capacity:"+getFuelCapacity());
		System.out.println("Fuel Type:"+getFuelType());
		System.out.println("Cc:"+getCc());
	}
	
	void displayDetailInfo() {}
	
}

class TwoWheeler extends Vehicle{
	private boolean kickstartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	}

	public boolean isKickstartAvailable() {
		return kickstartAvailable;
	}

	public void setKickstartAvailable(boolean kickstartAvailable) {
		this.kickstartAvailable = kickstartAvailable;
	}
	
	void displayDetailInfo()
	{
		System.out.println("----Detailed information----");
		if(isKickstartAvailable()==true) {
			System.out.println("Kick Start Availability: YES");	
		}
		else
		{
			System.out.println("Kick Start Availability: NO");
		}

	}
	
	
	
}

class FourWheeler extends Vehicle{
	private String audioSystem;
	private String noofDoors;

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public String getNoofDoors() {
		return noofDoors;
	}

	public void setNoofDoors(String noofDoors) {
		this.noofDoors = noofDoors;
	}
	
	void displayDetailInfo() {
		System.out.println("----Detailed information----");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("No of doors:"+getNoofDoors());
	}
	
}

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Vehicle make:");
			String vmake=sc.next();
			System.out.println("Vehicle number:");
			String vnum=sc.next();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int option=sc.nextInt();
			String fuel;
			if(option==1) {
				fuel = "Petrol";}
			else {
				fuel="Diesel";
			}
			System.out.println("Fuel Capacity:");
			int fuelcap=sc.nextInt();
			System.out.println("Engine cc:");
			int engcc=sc.nextInt();
			FourWheeler fw=new FourWheeler(vmake,vnum,fuel,fuelcap,engcc);
			System.out.println("Audio System:");
			fw.setAudioSystem(sc.next());
			System.out.println("No of doors:");
			fw.setNoofDoors(sc.next());
			fw.displayMake();
			fw.displayBasicInfo();
			fw.displayDetailInfo();	
		}
		else {
			System.out.println("Vehicle make:");
			String vmake=sc.next();
			System.out.println("Vehicle number:");
			String vnum=sc.next();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int option=sc.nextInt();
			String fuel;
			if(option==1) {
				fuel = "Petrol";}
			else {
				fuel="Diesel";
			}
			System.out.println("Fuel Capacity:");
			int fuelcap=sc.nextInt();
			System.out.println("Engine cc:");
			int engcc=sc.nextInt();
			TwoWheeler tw=new TwoWheeler(vmake,vnum,fuel,fuelcap,engcc);
			System.out.println("Kick Start available(yes/no):");
			boolean ans=(sc.next().equals("yes"))? true:false;
			tw.setKickstartAvailable(ans);
			tw.displayMake();
			tw.displayBasicInfo();
			tw.displayDetailInfo();	
		}
		sc.close();		
	}
}