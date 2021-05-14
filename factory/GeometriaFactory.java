package padroes.factory;

public class GeometriaFactory {
	
	 public static Geometria calcular(String forma) {
		 
		 if(forma.toLowerCase().equals("quadrado")) {
			 
			 return new Quadrado();
			 
		 }else if(forma.toLowerCase().equals("triangulo")) {
			 
			 return new Triangulo();
			 
		 }else {
			 
			 return null;
			 
		 }
		 
	 }
	
}
