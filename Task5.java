package tasks;
import java.util.*;
public class Task5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character:");
		
		char c=sc.next().charAt(0);
		int a=(int)c;
		
		System.out.println("Character: "+c);
		System.out.println("Character --> Ascii: "+a);
		
		sc.close();

	}

}
