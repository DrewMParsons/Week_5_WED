package calculator_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEntry
{

	public static void main(String[] args) 
	{
		
		Calc calculator =  new Calc(){

			@Override
			public Integer compute(Integer[] ints)
			{
			
				Integer  sum=0;
				for (Integer i : ints)
				{
					sum += i;
				}
				return sum;
				}
			};
			
		Calc calculatorMinus =  new Calc() {

			@Override
			public Integer compute(Integer[] ints)
			{
				Integer  sum=0;
				for (Integer i : ints)
				{
					sum -= i;
				}
				return sum;
				}
			};
			
		Calc calculatorMinusTwoNumbers =  new Calc() {
				
			@Override
			public Integer compute(Integer[] ints)
			{
				//subtract 2 numbers and return result
				
				return ints[0]-ints[1];
			}
			};
			
		Calc calculatorMultiply =  new Calc() {
			
			@Override
			public Integer compute(Integer[] ints)
			{
				Integer  sum=1;
				for (Integer i : ints)
				{
					sum *= i;
				}
				return sum;
				}};
				
				
		Calc calculatorMultiplyTwoNumbers =  new Calc() {
			
			@Override
			public Integer compute(Integer[] ints)
			{
				//subtract 2 numbers and return result
				
				return ints[0]*ints[1];
			}};
			
		Calc calculatorDivide =  new Calc() {
			
			@Override
			public Integer compute(Integer[] ints)
			{
				//subtract 2 numbers and return result
				
				return ints[0]/ints[1];
			}};
	
			Calc calcAddLambda = (i) -> i[0]+i[1];
			Calc calcMinusLambda = (i) ->  i[0]-i[1];
			Calc calcMultiplyLambda = (i) ->  i[0]*i[1];
			Calc calcDivideLambda = (i) ->  i[0]/i[1];
			
			
	
			System.out.println("please enter any amount of numbers\r(only two numbers for divide)\rand type 'E' to end:\r");
			Scanner sc = new Scanner(System.in);
		
			List<Integer> intArray = new ArrayList<Integer>();
			while(sc.hasNextInt()) {
				
				intArray.add(sc.nextInt());
			}
			sc.nextLine();
		
			
			
			
			Integer[] ints = new Integer[intArray.size()];
			ints = intArray.toArray(ints);
			
			
			boolean inputIsValid;
			do {
			inputIsValid = false;
			System.out.println("ENTER +,-,*,or /:\r");
			
			
			char result = sc.nextLine().charAt(0);
		
			
			switch(result){
			case '+':
				//do add
				System.out.println(calculator.compute(ints));
				break;
			case '-':
				//do subtract
				System.out.println(calculatorMinus.compute(ints));
				break;
			case '*':
				//do multiply
				System.out.println(calculatorMultiply.compute(ints));
				break;
			case '/':
				//do divide
				System.out.println(calculatorDivide.compute(ints));
				break;
			default:
				System.out.println("Thats not a valid computation symbol");
				
				inputIsValid=true;
				break;
			}
			}while(inputIsValid);
			
			sc.close();
		
	}

}
