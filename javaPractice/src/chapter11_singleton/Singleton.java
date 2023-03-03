package chapter11_singleton;

public class Singleton {
	int num;
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	static Singleton getInstance() {
		return singleton;
	}
}
