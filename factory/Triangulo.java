package padroes.factory;

public class Triangulo implements Geometria{

	@Override
	public String calcularPerimetro(int lado) {
		return "O perimetro do triângulo vale: " + lado * 3;
	}

	@Override
	public String calcularArea(int lado) {
		return "A area do triângulo vale: " + Math.pow(lado, 2) * Math.sqrt(3)/4;
	}
	
	
	
}
