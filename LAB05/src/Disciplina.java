package src;


public class Disciplina {
	public static final int MAX_ALUNOS = 25;
	private static final int NOME_MIN_LEN = 4;
	public final int id;
	private String nome;
	// TODO: Criar atributos para armazenar alunos

	
	public Disciplina(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() >= Disciplina.NOME_MIN_LEN) {
			this.nome = nome;
		} else {
			System.out.println("O nome informado possui menos de " + Disciplina.NOME_MIN_LEN + " caracteres.");
		}
	}
	
	public boolean addAluno( /*ALUNO*/ ) {
		// TODO: Adicionar aluno à disciplina (e disciplina a lista de disciplinas do aluno)
	}
	
	public boolean removeAluno( /*ALUNO*/ ) {
		// TODO: Remover aluno da disciplina (e disciplina da lista de disciplinas de aluno)
	}

	public void imprimeDados() {
		String resp = this.nome + "(" + this.id + ")\n";
		int matricula;
		
		for ( /*<CADA_ALUNO>*/ ) {
			if (i == 0) {
				resp += "[" + matricula;
			} else { 
				resp += ", " + matricula;
			}
		}
		resp += "]";
		
		System.out.println(resp);
	}
	
}
