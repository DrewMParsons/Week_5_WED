package lambdaCalc;

import java.util.Scanner;

public class CalcMain
{

	public static void main(String[] args)
	{
		MyCalc<Integer> calc = new MyCalc<Integer>();
		MyCalc<Float> calc2 = new MyCalc<Float>();
		System.out.println("Enter two numbers and select the operatoin from these: =,-,*,or /");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String sel = sc.nextLine().trim();
		sc.close();
		
		switch(sel) 
		{
		case("+"):
			System.out.println(calc.sum.compute(num1, sel, num2));
			break;	
		case("-"):
			System.out.println(calc.subtract.compute(num1, sel, num2));
			break;	
		case("*"):
			System.out.println(calc2.multiply.compute((float)num1, sel, (float) num2));
			break;	
		case("/"):
			System.out.println(calc2.divide.compute((float)num1, sel, (float)num2));
			break;	
		
		}

	}

}
