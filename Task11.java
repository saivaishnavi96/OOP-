package tasks;
class Animal{
	void eat() {
		System.out.println("This animal eats food");
	}
	void sleep() {
		System.out.println("This animal sleep");
	}
}
class Lion extends Animal{
	void roar() {
		System.out.println("The lion roar loudly!");
	}
}
public class Task11 {

	public static void main(String[] args) {
		Lion l=new Lion();
		l.eat();
		l.sleep();
		l.roar();
				
		// TODO Auto-generated method stub

	}

}
