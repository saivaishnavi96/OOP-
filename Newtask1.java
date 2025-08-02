package tasks;
import java.util.*;
class Student{
	String name;
	int rollno;
	int marks;
	    void setter(String name, int rollno, int marks) {
	    	this.name=name;
	    	this.rollno=rollno;
	    	this.marks=marks;
	    }
	    void getter() {
	    	System.out.println("Name of the student:"+name);
	    	System.out.println("Roll no of the student:"+rollno);
	    	System.out.println("Marks of the student:"+marks);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of the Student:");
		String name=sc.next();
		System.out.println("Enter Rollno of the Student:");
		int rollno=sc.nextInt();
		System.out.println("Enter Marks of the Student:");
		int marks=sc.nextInt();
		Student st=new Student();
		st.setter(name, rollno, marks);
		st.getter();
		sc.close();


	}

}
