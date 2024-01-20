package DesignPattern;

public class SingleObject1Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingleObject1 obj = SingleObject1.getInstance();

		System.out.println(obj.hashCode());

		SingleObject1 obj1 = (SingleObject1) obj.clone();

		System.out.println(obj1.hashCode());

	}

}
