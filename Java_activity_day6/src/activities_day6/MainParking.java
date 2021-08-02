package activities_day6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;  
import java.time.LocalTime;
import java.util.Scanner;

class Model{
	private String VehichleNum;
	private String mobile;
	private LocalTime inTime;
	private LocalTime OutTime;
	private LocalDate currentDate;
	private double amount;
	
	public String getVehichleNum() {
		return VehichleNum;
	}
	public void setVehichleNum(String vehichleNum) {
		this.VehichleNum = vehichleNum;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalTime getInTime() {
		return inTime;
	}
	public void setInTime(LocalTime inTime) {
		this.inTime = inTime;
	}
	public LocalTime getOutTime() {
		return OutTime;
	}
	public void setOutTime(LocalTime outTime) {
		OutTime = outTime;
	}
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void FeeCalculation(){
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Vehicle Number:");
		setVehichleNum(sc.next());
		
		System.out.println("Enter Mobile Number:");
		setMobile(sc.next());
		
		System.out.println("Enter the in-time in hh:mm:ss");
		String time=sc.next();
		
		setInTime(LocalTime.parse(time));
		setOutTime(LocalTime.now());
		setCurrentDate(LocalDate.now());
		
		LocalTime time1=getInTime();
		LocalTime time2=getOutTime();
		
		long hours = ChronoUnit.HOURS.between(time1, time2);  
		long minutes=ChronoUnit.MINUTES.between(time1, time2); 
		
	    if(hours<1) {
	    	setAmount(10);
	    }
	    if(hours>=1 && minutes>0) {
	    	setAmount(10*(hours+1));
	    }
	    if(hours>=1 && minutes==0) {
	    	setAmount(10*(hours));
	    }
	    
	    System.out.println("Vehicle NO:"+getVehichleNum());
	    System.out.println("Mobile NO:"+getMobile());
	    System.out.println("Vehicle In-Time:"+getInTime());
	    System.out.println("Vehicle Out-Time:"+getOutTime());
	    System.out.println("Total Fare:"+getAmount());
		sc.close();
		
		
	}

}

public class MainParking {

	public static void main(String[] args) {
		
		Model m=new Model();
		m.FeeCalculation();
		
		// TODO Auto-generated method stub

	}

}
