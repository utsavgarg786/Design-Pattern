package DesignPattern;

public class SingleObjectDemo {

	public static void main(String[] args) {

		SingleObject obj = SingleObject.getInstance();
		
		System.out.println(obj.hashCode());
		
		SingleObject obj1 = SingleObject.getInstance();
		
		System.out.println(obj1.hashCode());
		
	}

}
