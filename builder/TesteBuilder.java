package padroes.builder;

public class TesteBuilder {

	public static void main(String[] args) {
		
		Matricula m1 = new MatriculaBuilder().setMatricula(12345)
				.setAluno("Maria Eduarda", "1° EM", "Manhã")
				.setResponsavel("Rosa Sousa", "(85) 8765-7288", "Avenida Lisboa")
				.build();
		
		System.out.println(m1.toString());
	}

}
