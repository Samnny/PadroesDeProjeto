package padroes.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		
		System.out.println(s1.texto);
		
		s1.texto = s1.texto.toLowerCase();
		
		System.out.println(s1.texto);
		System.out.println(s2.texto);
		
		s1.texto = s1.texto.toUpperCase();
		
		System.out.println(s3.texto);
		System.out.println(s4.texto);
		
	}

}
