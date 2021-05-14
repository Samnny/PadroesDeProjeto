package padroes.factory;

public class TesteFactory {

	public static void main(String[] args) {
		
		Geometria geo = new GeometriaFactory().calcular("quaDrado");
		
		System.out.println(geo.calcularArea(5));
		System.out.println(geo.calcularPerimetro(5));
		
		Geometria geo2 = new GeometriaFactory().calcular("Triangulo");
		
		System.out.println(geo2.calcularArea(5));
		System.out.println(geo2.calcularPerimetro(5));
		
	}

}
