package inheritenceExample;

public class Inheritence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(10, 10);
		tri.set_values(2, 4);
		
		System.out.println("Area of rectangle is = "+rec.area());
		System.out.println("Area of rectangle is = "+tri.area());  
	}

}
