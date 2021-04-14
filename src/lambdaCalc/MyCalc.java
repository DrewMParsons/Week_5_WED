package lambdaCalc;

public class MyCalc <T>
{
	Calculator<Integer> sum = (a,b,c) -> a+c;
	Calculator<Integer> subtract = (a,b,c) -> a-c;
	Calculator<Float> multiply = (a,b,c) -> a*c;
	Calculator<Float> divide = (a,b,c) -> a/c;

}
