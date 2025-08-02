package tasks;
import java.util.*;
public class Task9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int a=sc.nextInt();
		
		System.out.println("Enter number:");
		int b=sc.nextInt();
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		sc.close();
	}

}
