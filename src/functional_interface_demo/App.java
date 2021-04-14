package functional_interface_demo;

public class App
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.show();
		
		InterfaceCompare<Integer> iCompare = (x,y) ->(x>y) ? x:y;
		System.out.println(iCompare.compare(4880,55));
		
		

	}

}
