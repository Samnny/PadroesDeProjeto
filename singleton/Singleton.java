package padroes.singleton;

public class Singleton {
	
	private static Singleton singleton;
	
	String texto;
	
	private Singleton() {
		
		texto = "Curso Java";
		
	}
	
	public static Singleton getInstance() {
		
		if(singleton == null) {
			
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
