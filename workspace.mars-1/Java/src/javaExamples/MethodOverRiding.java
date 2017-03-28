package javaExamples;

public class MethodOverRiding {

	public static void main(String[] args) {

          Parent p = new Parent();
          Child c = new Child();
          Parent d = new Child();
         
          p.Body();
          c.Body();
          c.child1();
          d.Body();
         

	}
	
	 static class Parent
	{
		public void Body(){
		 System.out.println("this is parent class");
	}
	}
	static class Child extends Parent{
		 public void Body()
		 {
			 System.out.println("this is child class");
		 }
		 int child1()
		 {
			return 0;
			 
		 }
		 
	 }
}
