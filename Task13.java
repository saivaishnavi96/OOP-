package tasks;
class Animalbehaviour{
	void eats() {
		System.out.println("This animal eats food");
	}
}
class Dog extends Animalbehaviour{
	void bark() {
		System.out.println("Dog bark loudly");
	}
}
class Puppy extends Dog{
	void weep() {
		System.out.println("Puppy weeps");
	}
}

public class Task13 {

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eats();
		p.bark();
		p.weep();
		
		// TODO Auto-generated method stub

	}

}
