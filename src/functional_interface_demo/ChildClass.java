package functional_interface_demo;

public class ChildClass implements MyFunctionalInterface
{
	String msg =  "Hiya";

	@Override
	public void show()
	{
		System.out.println(msg);
		
	}

}
