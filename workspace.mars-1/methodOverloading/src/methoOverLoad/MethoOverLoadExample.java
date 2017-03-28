package methoOverLoad;

public class MethoOverLoadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//method overloading is giving the same class name for diff para
		System.out.println(ADD(1,34));
		System.out.println(ADD(34.53,54.65));
		System.out.println(ADD("Vijay","RAJ"));
	}
	public static int ADD(int a, int b)
	{
		return(a+b);
	}
	public static double ADD(double a, double  b)
	{
		return(a+b);
	}
	public static String ADD(String a, String b)
	{
		return(a+b);
	}

}
