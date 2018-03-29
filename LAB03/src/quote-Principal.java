package src;
//import mc302ef.GerenciadorDisciplinas;
//import mc302ef.GerenciadorFuncionarios;

	
	public static void main(String[] args) {
		/*
		 * Parte 1
		 * Leitura de disciplinas e alunos
		 */
		String[][] disciplinas_info = GerenciadorDisciplinas.getDisciplinas();
		int discId;
		String discNome;
		
		// Exibição das disciplinas (Para entendimento do código)
		System.out.println("Disciplinas:"); // TODO: remover print
		for (int i = 0; i < disciplinas_info.length; i++) {
			discId = Integer.parseInt(disciplinas_info[i][0]);
			discNome = disciplinas_info[i][1];
			
			System.out.println("ID: " + discId + ", NOME: " + discNome); // TODO: Remover print
			// TODO: Instânciar Disciplinas

			// Alunos
			int[] matriculasAlunos = GerenciadorDisciplinas.getAlunosPorDisciplina( discId );
			// TODO: Adicionar matrículas dos alunos à respectiva disciplina
		}
		/*
		 * Parte 2
		 * Busca/remoção e exibição
		 */
		int[] alunos_para_remover = GerenciadorDisciplinas.getAlunosARemover();
		
		// TODO: Remova os alunos listados

		// TODO: Exiba todos os alunos por disciplina

		
		/*
		 * Parte 3
		 * Cadastro de funcionários
		 */
		
		GerenciadorFuncionarios sim = new GerenciadorFuncionarios();
		String[] funcionario_info;
		String funcNome, funcCPF;
		// <...> funcionarios = new <...>; Estrutura para armazenar instâncias de funcionários
		while ( (funcionario_info = sim.getNextFuncionario()) != null) {
			funcNome = funcionario_info[GerenciadorFuncionarios.NOME];
			funcCPF = funcionario_info[GerenciadorFuncionarios.CPF];

			// TODO: Instanciar funcionarios e armazenar em estrutura apropriada.
		}
	}

}
