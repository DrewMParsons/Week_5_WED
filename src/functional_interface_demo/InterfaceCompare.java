package functional_interface_demo;

@FunctionalInterface
public interface InterfaceCompare <T>
{
	T compare(T a, T b);

}
