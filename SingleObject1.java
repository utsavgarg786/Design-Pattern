package DesignPattern;

public class SingleObject1 extends MyClone{
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	private static SingleObject1 instance1;

	private SingleObject1() {
	}

	public static SingleObject1 getInstance() {
		if (instance1 == null) {
			instance1 = new SingleObject1();
		}
		return instance1;
	}
}
