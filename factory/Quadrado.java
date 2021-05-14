package padroes.factory;

public class Quadrado implements Geometria{
	
	public String calcularPerimetro(int lado) {
		return "O perimetro do quadrado vale: " + lado * 4;
	}
	
	public String calcularArea(int lado) {
		return "A area do quadrado vale: "+ Math.pow(lado, 2);
	}
	
}
