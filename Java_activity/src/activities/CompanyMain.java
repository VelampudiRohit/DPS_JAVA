package activities;
/**
 * @author Velampudi Rohit
 * @SFID 292119
 * @Question 4
 * @Activity 1
 */
import java.util.Scanner;

class Company{
	private String name; 
	private String employees;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	void DataInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name:");
		setName(sc.nextLine());
		System.out.println("Enter the employees:");
		setEmployees(sc.nextLine());
		System.out.println("Enter the teamlead:");
		setTeamlead(sc.nextLine());		
		sc.close();
	}
	
	void DataOutput()
	{
		if(employees.contains(teamlead)) {
			System.out.println("Name:"+getName());
			System.out.println("Employees:"+getEmployees());
			System.out.println("Teamlead:"+getTeamlead());
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	
}
public class CompanyMain {

	public static void main(String[] args) {
		Company c=new Company();
		c.DataInput();
		c.DataOutput();

	}

}
