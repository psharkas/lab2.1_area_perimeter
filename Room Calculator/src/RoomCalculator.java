
import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in); 
		
		System.out.println("Enter a value for length");
		double length = scnr.nextDouble();
		System.out.println("Enter a value for width");
		double width = scnr.nextDouble();
		
		double area = length*width;
		double perimeter = length*2 + width*2;
		
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
		
	}

}
