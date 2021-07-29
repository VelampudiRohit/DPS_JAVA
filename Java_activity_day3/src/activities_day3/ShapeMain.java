package activities_day3;
import java.util.*;

abstract class Shape{ 
	int value;
	abstract void CalculateArea(int value);
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}  
}  


class Circle extends Shape{  
	final double pi=Math.PI;

@Override
void CalculateArea(int value) {
	double area=(pi * Math.pow(value, 2));
	System.out.println(String.format("%.2f", area));
	}  
}  


class Square extends Shape{  

@Override
void CalculateArea(int value) {
	double area=(Math.pow(value, 2));
	System.out.println(String.format("%.2f", area));
  }  
}



public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle\nSquare\nEnter the shape:");
		String s=sc.nextLine();
		if(s.equals("Circle")) {
			Circle c=new Circle();
			System.out.println("Enter the radius:");
			c.setValue(sc.nextInt());
			c.CalculateArea(c.getValue());
		}
		else if(s.equals("Square")) {
			Square sq=new Square();
			System.out.println("Enter the radius:");
			sq.setValue(sc.nextInt());
			sq.CalculateArea(sq.getValue());
		}
		

		sc.close();
	}

}