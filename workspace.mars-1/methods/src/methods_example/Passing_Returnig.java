package methods_example;

public class Passing_Returnig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	sayHello("vijay");
	sayHello("raj");
	int sum = Add(50,54);
	System.out.println(sum);
		
	}
	//just passing the arguments
		public static void sayHello(String name)
		{
			System.out.println("Hello " +name);
		}
   
	//returning the arguments
		public static int Add(int a, int b)
		{
			return(a+b);
		}
		int i= Add(1,2);
		{
		
		System.out.println(i);
	}}


