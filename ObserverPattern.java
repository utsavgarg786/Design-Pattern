package DesignPattern;

public class ObserverPattern {

	public static void main(String[] args) {

		Channel hostages = new Channel();
		
		Subscriber s1 = new Subscriber("Utsav");
		Subscriber s2 = new Subscriber("Priyanshu");
		
		hostages.subscribe(s1);
		hostages.subscribe(s2);
		
		s1.subscribeChannel(hostages);
		s2.subscribeChannel(hostages);
		
		hostages.upload("Episode 2");
	}

}
