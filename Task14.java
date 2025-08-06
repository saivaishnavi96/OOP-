package tasks;
class Person{
	String name;
	void display_info() {
		System.out.println("Name: "+name);
	}
}
class Std extends Person{
	String student_ID;
	void student_ID() {
		System.out.println("Student ID: "+student_ID);
	}
}
class GraduateStudent extends Std{
	void submitThesis() {
		System.out.println("Thesis submitted");
	}
	
}
public class Task14 {

	public static void main(String[] args) {
		GraduateStudent g=new GraduateStudent();
		g.name="vaishnavi";
		g.student_ID="2420080096";
		g.display_info();
		g.student_ID();
		g.submitThesis();
		// TODO Auto-generated method stub

	}

}
