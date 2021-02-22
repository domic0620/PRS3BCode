package comm;

public class EjemploSingleton {
	
	private static EjemploSingleton instance = null;
	
	private EjemploSingleton() {}
	
	public static synchronized EjemploSingleton getInstance() {
		if(instance == null) {
			instance = new EjemploSingleton();
		}
		return instance;
	}

}
