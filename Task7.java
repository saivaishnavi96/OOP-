package tasks;
import java.util.*;
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int a=sc.nextInt();
		
		System.out.println("Enter number:");
		int b=sc.nextInt();
		
		System.out.println("Enter number:");
		int c=sc.nextInt();
		
		double average=(a+b+c/3);
		System.out.println("Average :"+average);
		sc.close();

	}

}
