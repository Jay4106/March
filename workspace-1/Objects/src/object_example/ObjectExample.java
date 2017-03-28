package object_example;

public class ObjectExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee vijay = new Employee(); // vijay is a object
		vijay.id= 1453;
		vijay.name="Vijay Raj";
		vijay.age=23;
		
		System.out.println("Employer name is "+vijay.name + " His age is"+vijay.age+" the id is "+vijay.id);

	}

}
