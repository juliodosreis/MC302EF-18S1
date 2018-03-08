public class Aluno {

	private int matricula;	// Considere números maiores que zero.
	private String nome;	// Considere tamanho de pelo menos 3.
	private String cpf;		// Considere tamanho igual a 11.
	private int curso;		// Considere números maiores que zero.

	public Aluno(int matricula, String nome, String cpf, int curso) {
		this.matricula = matricula;
		// TODO: Continuar preenchimento dos atributos.
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		if (matricula > 0) {
			this.matricula = matricula;
		} else {
			System.out.println("Matrícula inválida.");
		}
	}

	// TODO: Continuar criação de getters ans setters.
	
	public void imprimeDados() {
		String saida = "########## Aluno\n";
		saida = saida + "Matrícula: " + getMatricula() + "\n";
		//TODO: Continuar composição do texto que exibe informações de Aluno.

		System.out.println(saida);
	}

}

