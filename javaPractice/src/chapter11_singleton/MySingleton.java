package chapter11_singleton;

class Singleton {
	private static class singleInstanceHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return singleInstanceHolder.INSTANCE;
	}
}

public class MySingleton {

}
