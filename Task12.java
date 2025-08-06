package tasks;
class Vehicle{
	void move() {
		System.out.println("The car is moving");
	}
}
class Car extends Vehicle{
	void fuelType() {
	System.out.println("The car uses petrol");
	}
}
public class Task12 {

	public static void main(String[] args) {
		Car c=new Car();
		c.move();
		c.fuelType();
		
		// TODO Auto-generated method stub

	}

}
