package DesignPattern;

public class SingleObject {

	/*
	 * private static SingleObject instance = new SingleObject();
	 * 
	 * private SingleObject() { }
	 * 
	 * public static SingleObject getInstance() { return instance; }
	 */

	private static SingleObject instance;

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		if(instance == null) {
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
		}
		return instance;
	}
}
