package calculator_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{

	public static void main(String[] args)
	{
		System.out.println("please enter two numbers \rand type 'E' to end:\r");
		Scanner sc = new Scanner(System.in);
		List<Integer> intArray = new ArrayList<Integer>();
		while (sc.hasNextInt())
		{
			intArray.add(sc.nextInt());
		}
		sc.nextLine();
		
		System.out.println("ENTER +,-,*,or /:\r");
		char result = sc.nextLine().charAt(0);

	}

}
