package polyExample;

public class PolymorphismExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base first= new First();
		Base second= new Second();
		Base third= new Third();
		
		first.Rate();
		second.Rate();
		third.Rate();
		System.out.println(" return of first "+first.Rate());
		System.out.println(" return of first "+second.Rate());
		System.out.println(" return of first "+third.Rate());
	}

}
