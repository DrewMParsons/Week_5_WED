package calculator_demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainEntry
{

	public static void main(String[] args)
	{

		Calc calculator = new Calc()
		{

			@Override
			public Integer compute(Integer[] ints)
			{

				Integer sum = 0;
				for (Integer i : ints)
				{
					sum += i;
				}
				return sum;
			}
		};

		Calc calculatorMinus = new Calc()
		{

			@Override
			public Integer compute(Integer[] ints)
			{
				Integer sum = 0;
				for (Integer i : ints)
				{
					sum -= i;
				}
				return sum;
			}
		};

		Calc calculatorMinusTwoNumbers = new Calc()
		{

			@Override
			public Integer compute(Integer[] ints)
			{
				// subtract 2 numbers and return result

				return ints[0] - ints[1];
			}
		};

		Calc calculatorMultiply = new Calc()
		{

			@Override
			public Integer compute(Integer[] ints)
			{
				Integer sum = 1;
				for (Integer i : ints)
				{
					sum *= i;
				}
				return sum;
			}
		};

		Calc calculatorMultiplyTwoNumbers = new Calc()
		{

			@Override
			public Integer compute(Integer[] ints)
			{
				// subtract 2 numbers and return result

				return ints[0] * ints[1];
			}
		};

		Calc calculatorDivide = new Calc()
		{

			@Override
			public Integer compute(Integer[] ints)
			{
				// subtract 2 numbers and return result

				return ints[0] / ints[1];
			}
		};

		Calc calcAddLambda = (i) -> i[0] + i[1];
		Calc calcMinusLambda = (i) -> i[0] - i[1];
		Calc calcMultiplyLambda = (i) -> i[0] * i[1];
		Calc calcDivideLambda = (i) -> i[0] / i[1];
		Calc calcMinusAllLambda = i  -> Arrays.asList(i).stream().reduce(0,(a,b)->a-b);
		Calc calcAddAllLambda  = i -> Arrays.asList(i).stream().mapToInt(Integer::intValue).sum();
		Calc calcMultiplyAllLambda = i -> Arrays.asList(i).stream().reduce(1,(a,b)->a*b);
		
		
		System.out.println("please enter any amount of numbers\r(only two numbers for divide)\rand type 'E' to end:\r");
		Scanner sc = new Scanner(System.in);

		List<Integer> intArray = new ArrayList<Integer>();
		while (sc.hasNextInt())
		{

			intArray.add(sc.nextInt());
		}
		sc.nextLine();

		Integer[] ints = new Integer[intArray.size()];
		ints = intArray.toArray(ints);
		Integer sum = intArray.stream().mapToInt(Integer::intValue).sum();
		Integer minus = intArray.stream().reduce(0, (a,b)->a-b);
		Integer multiply = intArray.stream().reduce(1,(a,b)->a*b);
		Integer divide = intArray.get(0)/intArray.get(1);
		
		

		boolean inputIsValid = false;
		do
		{
			inputIsValid = false;
			System.out.println("ENTER +,-,*,or /:\r");

			char result = sc.nextLine().charAt(0);

			switch (result)
			{
			case '+':
				// do add
				//System.out.println(calcAddAllLambda.compute(ints));
				System.out.println(sum);
				break;
			case '-':
				// do subtract
				//System.out.println(calcMinusAllLambda.compute(ints));
				System.out.println(minus);
				break;
			case '*':
				// do multiply
				//System.out.println(calcMultiplyAllLambda.compute(ints));
				System.out.println(multiply);
				break;
			case '/':
				// do divide
				//System.out.println(calculatorDivide.compute(ints));
				System.out.println(divide);
				break;
			default:
				System.out.println("Thats not a valid computation symbol");

				inputIsValid = true;
				break;
			}
		} while (inputIsValid);

		sc.close();

	}
	
	

}
