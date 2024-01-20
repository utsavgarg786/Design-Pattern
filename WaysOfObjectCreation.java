package DesignPattern;

public class WaysOfObjectCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Tester tester1 = new Tester();
		
		Tester tester2 = (Tester) Class.forName("Tester").newInstance();
		
		
		//Tester tester3 = Tester.clone();
		
		//Tester tester4 = Tester.clas
	}

}

class Tester{
	
}