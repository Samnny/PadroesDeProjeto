package padroes.builder;

public class Matricula {
	
	private long cadastro;
	private Responsavel responsavel;
	private Aluno aluno;
	
	
	public long getCadastro() {
		return cadastro;
	}
	public void setCadastro(long cadastro) {
		this.cadastro = cadastro;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	@Override
	public String toString() {
		return "--------------------------------------"
			  +"\n#        Matricula Aluno           #"
			  +"\n------------------------------------"
			  +"\nCadastro: " + cadastro
			  +"\nAluno:" + aluno.getNome()
			  +"\nSerie:" + aluno.getSerie()
			  +"\nTurno:" + aluno.getTurno()
			  +"\n------------------------------------"
			  +"\nResponsavel:" + responsavel.getNome()
			  +"\nTelefone:" + responsavel.getTelefone()
			  +"\nEndereço:" + responsavel.getEndereco();
	}
	
	
	
	
}
