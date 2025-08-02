package tasks;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the name of the student:");
		String name = sc.nextLine();
		
		System.out.println("Enter the rollno:");
		int rollno=sc.nextInt();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("Enter the gender:");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter the percentage:");
		double percentage=sc.nextDouble();
		
		System.out.println("Name:" + name);
		System.out.println("Roll no:" + rollno);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
		System.out.println("Percentage:" + percentage);
		
		sc.close();	
	}

}
