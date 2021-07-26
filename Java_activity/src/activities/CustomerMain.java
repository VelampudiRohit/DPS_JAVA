package activities;

/**
 * @author Velampudi Rohit
 * @SFID 292119
 * @Question 3
 * @Activity 1
 */
import java.util.Scanner;

class Customer{
	private String name; 
	private String address;
	private String mobile;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	void Getter() {
		Scanner sc=new Scanner(System.in); //scanner class created
		int a=0;
		while(a==0) {
			System.out.print("Enter the details: ");  
			String info = sc.nextLine(); 
			String[] words=info.split(",");
			setName(words[0]);
			setAddress(words[1]);
			setMobile(words[2]);
			if(mobile.length()==10) {
				a=1;
			}
			else
			{
				System.out.println("Enter valid number!");
			}	
		}
		
		sc.close();
	}
	
	void Setter()
	{
		System.out.println("\nDetails:");
		System.out.println("name: "+getName());  
		System.out.println("address: "+getAddress());   
		System.out.println("mobile: "+getMobile());		 
	}	
}
public class CustomerMain {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.Getter();
		c.Setter();

	}

}
