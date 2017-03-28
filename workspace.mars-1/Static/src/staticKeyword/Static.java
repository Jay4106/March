package staticKeyword;

public class Static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		employee vijay = new employee();
		vijay.age= 23;
		System.out.println(employee.getNoOfEmployees());
		employee raj = new employee();
		raj.name= "raj";
		System.out.println(employee.getNoOfEmployees());
		System.out.println(raj.getName());
		
      //System.out.println(employee.getNoOfEmployees());
      	}
	

}
