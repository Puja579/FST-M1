package activities;

public class Car {
	public String color;
	public String transmission;
	public int make;
	public int tyres;
	public int doors;
	
	public Car(){
		tyres =4;
		doors = 4;
	}
	public void displayCharacterstics() {
	System.out.println("color of the car: " + color);
	System.out.println("Make of the car: " + make);
	System.out.println("Transmission of the car: " + transmission);
	System.out.println("Tyres of the car: " + tyres);
	System.out.println("Doors of the car: " + doors);
	}
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has Stopped");
		
	}
}
